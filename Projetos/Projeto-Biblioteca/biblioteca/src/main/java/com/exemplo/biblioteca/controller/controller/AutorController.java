package com.exemplo.biblioteca.controller.controller;

import com.exemplo.biblioteca.model.service.AutorService;
import com.exemplo.biblioteca.view.dto.AutorCreateRequest;
import com.exemplo.biblioteca.view.dto.AutorResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/autores")
public class AutorController {
    private final AutorService autorService;

    @GetMapping
    public List<AutorResponse> verTodos(){
        return autorService.listarTodosAutores();
    }

    @GetMapping("/{id}")
    public List<AutorResponse> verPorId(@PathVariable Long id){
        return autorService.buscaPorId(id);
    }

    @PostMapping
    public AutorResponse cadastrar(@RequestBody AutorCreateRequest req){
        return autorService.cadastroAutor(req);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarPorId(@PathVariable  Long id){
        autorService.deletePorId(id);
    }
}
