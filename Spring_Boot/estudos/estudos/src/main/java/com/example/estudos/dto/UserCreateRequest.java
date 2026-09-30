package com.example.estudos.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

// Define o formato dos dados
public record UserCreateRequest(
        @NotBlank String name,
        @Email @NotBlank String email
) {}
