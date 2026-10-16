package com.exemplo.biblioteca.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "livros")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LivroEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String isbn;
    private Integer anoPublicacao;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "autor_id")
    private AutorEntity autor;

    @ManyToMany
    @JoinTable(
            name = "livro_categoria",
            joinColumns = @JoinColumn(name = "livro_id"), // Aponta para essa entity
            inverseJoinColumns = @JoinColumn(name = "categoria_id") // Aponta para entity de categoria
    )
    private Set<CategoriaEntity> categorias = new HashSet<>();

    public LivroEntity(String titulo, String isbn, Integer anoPublicacao, AutorEntity autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
    }

}
