package com.exemplo.biblioteca.view.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AutorResponse {
    private Long id;
    private String nome;
    private String nacionalidade;
}
