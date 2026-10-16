package com.exemplo.biblioteca.view.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LivroResponse {
    private Long id;
    private String titulo;
    private String isbn;
    private Integer anoPublicacao;
    private Long autorId;
    private String autorNome;
    private Set<CategoriaResumo> categorias;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CategoriaResumo {
        private Long id;
        private String nome;
    }

}
