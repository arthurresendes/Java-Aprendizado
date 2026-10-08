package com.example.estudos.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "produtos")
@Getter
@Setter
@NoArgsConstructor
public class ProdutoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeProduto;
    private Double preco;
    private Integer qtd;

    public ProdutoEntity(String nomeProduto, Double preco, Integer qtd){
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.qtd = qtd;
    }

}
