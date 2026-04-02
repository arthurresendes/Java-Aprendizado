package com.example.Stock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "control_stock")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer quantidade;
    private Float preco;

    public Stock(){

    }

    public Stock(Long id, String name, Integer quantidade, Float preco){
        this.id = id;
        this.name = name;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id;}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Integer getQuantidade() { return quantidade; }
    public void setQuantidade(Integer quantidade) { this.quantidade = quantidade; }

    public Float getPreco() { return preco; }
    public void setPreco(Float preco) { this.preco = preco; }
}
