package com.example.estudos.dto;


public record ProdutoUpdate(
        String nomeProduto,
        Double preco,
        Integer qtd
) { }
