package com.exemplo.biblioteca.controller.controller;

import com.exemplo.biblioteca.model.service.LivroService;
import com.exemplo.biblioteca.view.dto.LivroCreateRequest;
import com.exemplo.biblioteca.view.dto.LivroResponse;
import com.exemplo.biblioteca.view.dto.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/livros")
public class LivroController {
    private final LivroService livroService;

    @GetMapping
    public List<LivroResponse> verTodosLivros(){
        return livroService.verTodosLivros();
    }

    @PostMapping
    public LivroResponse cadastrarLivro(@RequestBody LivroCreateRequest request){
        return livroService.cadastrarLivro(request);
    }

    @GetMapping("/{id}")
    public LivroResponse verPorId(Long id){
        return livroService.buscarPorId(id);
    }
}
