package com.exemplo.biblioteca.view.dto;

import org.antlr.v4.runtime.misc.NotNull;

public record AutorCreateRequest(
        @NotNull String nome,
        @NotNull String nacionalidade
){}
