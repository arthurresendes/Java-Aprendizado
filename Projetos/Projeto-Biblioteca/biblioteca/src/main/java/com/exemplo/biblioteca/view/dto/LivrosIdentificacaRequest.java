package com.exemplo.biblioteca.view.dto;

import jakarta.validation.constraints.NotEmpty;

import java.util.Set;

public record LivrosIdentificacaRequest(
        @NotEmpty Set<Long> livrosIds
) {
}
