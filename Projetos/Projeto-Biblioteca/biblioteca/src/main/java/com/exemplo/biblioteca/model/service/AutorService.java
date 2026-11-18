package com.exemplo.biblioteca.model.service;


import com.exemplo.biblioteca.exception.ResourceNotFoundException;
import com.exemplo.biblioteca.model.entity.AutorEntity;
import com.exemplo.biblioteca.model.repository.AutorRepository;
import com.exemplo.biblioteca.view.dto.AutorCreateRequest;
import com.exemplo.biblioteca.view.dto.AutorResponse;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AutorService {
    private final AutorRepository autorRepository;

    // O @Transactional ele inicia uma conexão com banco de de dados antes do código rodar, se o metodo terminar sem erros da commit e se der erro da roolback
    @Transactional
    @Cacheable(value = "autores", key = "'todos'") // Cacheable para ler e buscar, os keys sao subgavetas da gaveta pai que é autores nesse caso
    public List<AutorResponse> listarTodosAutores(){
        return autorRepository.findAll().stream().map(aut -> new AutorResponse(aut.getId(),aut.getNome(),aut.getNacionalidade())).toList();
    }

    @Transactional
    @Cacheable(value = "autores", key = "#id")
    public List<AutorResponse> buscaPorId(Long id){
        Optional<AutorEntity> aut = autorRepository.findById(id);
        return aut.stream().map(a -> new AutorResponse(a.getId(),a.getNome(),a.getNacionalidade())).toList();
    }

    @Transactional
    @CacheEvict(value = "autores", allEntries = true) // CachceEvict para criar, editar ou apagar
    public AutorResponse cadastroAutor(AutorCreateRequest req){
        AutorEntity aut = new AutorEntity(req.nome(), req.nacionalidade());
        AutorEntity salvar = autorRepository.save(aut);
        return new AutorResponse(salvar.getId(), salvar.getNome(), salvar.getNacionalidade());
    }

    @Transactional
    @CacheEvict(value = "autores", allEntries = true)
    public AutorResponse atualizarAutor(Long id, AutorCreateRequest autorR){
        AutorEntity autorAtualizar = autorRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Autor não encontrado com o ID: " + id));

        autorAtualizar.setNome(autorR.nome());
        autorAtualizar.setNacionalidade(autorR.nacionalidade());
        return new AutorResponse(id, autorR.nome(), autorR.nacionalidade());
    }

    @Transactional
    @CacheEvict(value = "autores", allEntries = true)
    public void deletePorId(Long id){
        autorRepository.deleteById(id);
    }


}
