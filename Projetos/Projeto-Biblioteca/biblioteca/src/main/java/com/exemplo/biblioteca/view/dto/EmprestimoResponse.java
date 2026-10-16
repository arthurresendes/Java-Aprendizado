package com.exemplo.biblioteca.view.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmprestimoResponse {
    private Long id;
    private LocalDate dataEmprestimo;
    private LocalDate dataPrevistaDevolucao;
    private LocalDate dataDevolucao;
    private Long livroId;
    private String nomeLivro;
    private Long userId;
    private String userNome;
}
