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
@AllArgsConstructor
public class EmprestimoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataEmprestimo;
    private LocalDate dataPrevistaDevolucao;

    @Column(nullable = true)
    private LocalDate dataDevolucao;


    @ManyToOne
    @JoinColumn(name = "livro_id")
    private LivroEntity livro;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private  UserEntity user;
}
