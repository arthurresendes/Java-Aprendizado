package com.exemplo.biblioteca.model.repository;

import com.exemplo.biblioteca.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
