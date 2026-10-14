package com.exemplo.biblioteca.model.repository;

import com.exemplo.biblioteca.model.entity.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<CategoriaEntity, Long> {

}
