package com.exemplo.biblioteca.view.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Set;

public record LivroCreateRequest(
        @NotBlank String titulo,
        @NotBlank String isbn,
        @NotNull Integer anoPublicacao,
        @NotNull Long autorId,
        Set<Long> categoriasIds
) {
}
