package com.exemplo.biblioteca.controller.controller;

import com.exemplo.biblioteca.model.service.AutorService;
import com.exemplo.biblioteca.view.dto.AutorCreateRequest;
import com.exemplo.biblioteca.view.dto.AutorResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Define que é um controller
@RequiredArgsConstructor // Utilizado para conseguir usar o private final e ter um instanciador base
@RequestMapping("/autores") // base das rotas partindo de /autores
public class AutorController {
    private final AutorService autorService;

    // Rota GET /autores
    @GetMapping
    public List<AutorResponse> verTodos(){
        return autorService.listarTodosAutores();
    }

    // Rota GET com busca por id, /autores/{id} -> Passado no PathVariable (na url)
    @GetMapping("/{id}")
    public List<AutorResponse> verPorId(@PathVariable Long id){
        return autorService.buscaPorId(id);
    }

    // Rota POST cadastro com RequestBody (no body)
    @PostMapping
    public AutorResponse cadastrar(@RequestBody AutorCreateRequest req){
        return autorService.cadastroAutor(req);
    }

    // Rota DELETE por id
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarPorId(@PathVariable  Long id){
        autorService.deletePorId(id);
    }
}
