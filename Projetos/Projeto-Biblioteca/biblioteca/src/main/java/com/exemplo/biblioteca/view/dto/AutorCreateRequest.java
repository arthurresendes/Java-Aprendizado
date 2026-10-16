package com.exemplo.biblioteca.view.dto;

import jakarta.validation.constraints.NotBlank;

public record AutorCreateRequest(
        @NotBlank String nome,
        @NotBlank String nacionalidade
){}
