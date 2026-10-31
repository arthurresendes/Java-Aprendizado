package com.exemplo.biblioteca.view.dto;


import jakarta.validation.constraints.NotNull;

public record EmprestimoCreateRequest(
        @NotNull Long livroId,
        @NotNull Long userId
        ) { }
