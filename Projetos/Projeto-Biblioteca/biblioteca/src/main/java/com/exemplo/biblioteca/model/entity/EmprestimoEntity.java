package com.exemplo.biblioteca.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "emprestimo")
@Getter
@Setter
@NoArgsConstructor
public class EmprestimoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataEmprestimo;
    private LocalDate dataPrevistaDevolucao;

    @Column(nullable = true)
    private LocalDate dataDevolucao;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "livro_id")
    private LivroEntity livro;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id")
    private UserEntity user;

    public EmprestimoEntity(LocalDate dataEmprestimo, LocalDate dataPrevistaDevolucao, LivroEntity livro, UserEntity user){
        this.dataEmprestimo = dataEmprestimo;
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;
        this.livro = livro;
        this.user = user;
    }
}
