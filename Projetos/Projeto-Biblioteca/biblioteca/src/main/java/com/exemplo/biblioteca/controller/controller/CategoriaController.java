package com.exemplo.biblioteca.controller.controller;

import com.exemplo.biblioteca.model.service.CategoriaService;
import com.exemplo.biblioteca.view.dto.CategoriaCreateRequest;
import com.exemplo.biblioteca.view.dto.CategoriaResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/categorias")
public class CategoriaController {
    private final CategoriaService categoriaService;

    @GetMapping
    public List<CategoriaResponse> verTodos(){
        return categoriaService.verTodasCategorias();
    }

    @PostMapping
    public CategoriaResponse cadastrar(@RequestBody CategoriaCreateRequest req){
        return categoriaService.cadastrar(req);
    }
}
