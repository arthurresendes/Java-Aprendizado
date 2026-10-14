package com.exemplo.biblioteca.model.repository;

import com.exemplo.biblioteca.model.entity.LivroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<LivroEntity, Long> {
}
