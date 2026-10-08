package com.example.estudos.controller;

import com.example.estudos.dto.ProdutoCreateRequest;
import com.example.estudos.dto.ProdutoResponse;
import com.example.estudos.dto.ProdutoUpdate;
import com.example.estudos.service.ProdutoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/produto")
public class ProdutoController {
    private final ProdutoService produtoService;

    @GetMapping
    public List<ProdutoResponse> buscarTodosProdutos(){
        return produtoService.buscarTodos();
    }

    @GetMapping("/{nomeProd}")
    public List<ProdutoResponse> buscarPorProd(@PathVariable  String nomeProd){
        return produtoService.pesquisarPorNome(nomeProd);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutoResponse cadastrarProd(@Valid @RequestBody ProdutoCreateRequest prod){
        return produtoService.cadastrarProd(prod);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePorId(@PathVariable  Long id){
        produtoService.deleteProd(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizar(@PathVariable Long id, @RequestBody ProdutoUpdate prod){
        produtoService.atualizarProd(id, prod);
    }



}
