package com.exemplo.biblioteca.view.dto;


import jakarta.validation.constraints.NotBlank;

public record CategoriaCreateRequest(
        @NotBlank String nome
) {
}
