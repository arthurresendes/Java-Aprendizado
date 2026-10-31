package com.exemplo.biblioteca.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="autores") // Nome da tabela
@Getter // .get()
@Setter // .set() -> Setar valor
@NoArgsConstructor // Obrigatorio do JPA obriga ter um construtor vazio
// @AllArgsConstructor - Cria o constructor com todos atributos
public class AutorEntity {
    @Id // Define qual será a chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Incrementa automaticamente
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String nacionalidade;

    // Criação do construtor, onde tem que passar os devidos atributos
    public AutorEntity(String nome, String nacionalidade){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }
}
