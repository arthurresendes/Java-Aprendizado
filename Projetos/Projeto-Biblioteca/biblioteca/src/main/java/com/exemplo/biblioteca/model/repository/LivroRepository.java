package com.exemplo.biblioteca.model.repository;

import com.exemplo.biblioteca.model.entity.LivroEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivroRepository extends JpaRepository<LivroEntity, Long> {
    @EntityGraph(attributePaths = {"autor", "categorias"})
    List<LivroEntity> findAll();
}
