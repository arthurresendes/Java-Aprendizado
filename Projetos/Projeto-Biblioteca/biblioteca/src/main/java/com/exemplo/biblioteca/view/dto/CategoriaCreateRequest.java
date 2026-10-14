package com.exemplo.biblioteca.view.dto;

import org.antlr.v4.runtime.misc.NotNull;

public record CategoriaCreateRequest(
        @NotNull String nome
) {
}
