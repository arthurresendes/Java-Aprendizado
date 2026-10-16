package com.exemplo.biblioteca.view.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UserCreateRequest (
    @NotBlank String nome,
    @NotBlank @Email String email
){}
