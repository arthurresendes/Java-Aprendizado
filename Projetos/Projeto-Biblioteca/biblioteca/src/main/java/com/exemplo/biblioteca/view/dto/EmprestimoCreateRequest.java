package com.exemplo.biblioteca.view.dto;


import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record EmprestimoCreateRequest(
        @NotNull Long livroId,
        @NotNull Long userId
        ) { }
