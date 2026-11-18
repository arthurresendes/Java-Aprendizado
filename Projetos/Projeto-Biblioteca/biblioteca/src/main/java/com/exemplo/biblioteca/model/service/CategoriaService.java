package com.exemplo.biblioteca.model.service;

import com.exemplo.biblioteca.model.entity.CategoriaEntity;
import com.exemplo.biblioteca.model.repository.CategoriaRepository;
import com.exemplo.biblioteca.view.dto.CategoriaCreateRequest;
import com.exemplo.biblioteca.view.dto.CategoriaResponse;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoriaService {
    private final CategoriaRepository categoriaRepository;

    @Transactional
    @Cacheable(value = "categorias", key = "'todos'")
    public List<CategoriaResponse> verTodasCategorias(){
        return categoriaRepository.findAll().stream().map(cat -> new CategoriaResponse(cat.getId(), cat.getNome())).toList();
    }

    @Transactional
    @CacheEvict(value = "categorias", allEntries = true)
    public CategoriaResponse cadastrar(CategoriaCreateRequest req){
        CategoriaEntity cate = new CategoriaEntity(req.nome());
        CategoriaEntity salvar = categoriaRepository.save(cate);
        return new CategoriaResponse(salvar.getId(), salvar.getNome());
    }
}
