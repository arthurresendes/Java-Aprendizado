package com.exemplo.biblioteca.model.service;


import com.exemplo.biblioteca.model.entity.AutorEntity;
import com.exemplo.biblioteca.model.repository.AutorRepository;
import com.exemplo.biblioteca.view.dto.AutorCreateRequest;
import com.exemplo.biblioteca.view.dto.AutorResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AutorService {
    private final AutorRepository autorRepository;

    public List<AutorResponse> listarTodosAutores(){
        return autorRepository.findAll().stream().map(aut -> new AutorResponse(aut.getId(),aut.getNome(),aut.getNacionalidade())).toList();
    }

    public List<AutorResponse> buscaPorId(Long id){
        Optional<AutorEntity> aut = autorRepository.findById(id);
        return aut.stream().map(a -> new AutorResponse(a.getId(),a.getNome(),a.getNacionalidade())).toList();
    }

    public AutorResponse cadastroAutor(AutorCreateRequest req){
        AutorEntity aut = new AutorEntity(req.nome(), req.nacionalidade());
        AutorEntity salvar = autorRepository.save(aut);
        return new AutorResponse(salvar.getId(), salvar.getNome(), salvar.getNacionalidade());
    }

    public void deletePorId(Long id){
        autorRepository.deleteById(id);
    }

    // PUT
}
