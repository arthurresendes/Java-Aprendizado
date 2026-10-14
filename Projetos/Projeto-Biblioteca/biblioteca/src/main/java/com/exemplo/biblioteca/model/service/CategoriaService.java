package com.exemplo.biblioteca.model.service;

import com.exemplo.biblioteca.model.entity.CategoriaEntity;
import com.exemplo.biblioteca.model.repository.CategoriaRepository;
import com.exemplo.biblioteca.view.dto.CategoriaCreateRequest;
import com.exemplo.biblioteca.view.dto.CategoriaResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoriaService {
    private final CategoriaRepository categoriaRepository;

    public List<CategoriaResponse> verTodasCategorias(){
        return categoriaRepository.findAll().stream().map(cat -> new CategoriaResponse(cat.getId(), cat.getNome())).toList();
    }

    public CategoriaResponse cadastrar(CategoriaCreateRequest req){
        CategoriaEntity cate = new CategoriaEntity(req.nome());
        CategoriaEntity salvar = categoriaRepository.save(cate);
        return new CategoriaResponse(salvar.getId(), salvar.getNome());
    }
}
