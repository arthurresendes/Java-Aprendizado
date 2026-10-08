package com.example.estudos.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProdutoCreateRequest(
    @NotBlank String nomeProduto,
    @NotNull Double preco,
    @NotNull Integer qtd
) { }
