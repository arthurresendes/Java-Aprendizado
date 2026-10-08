package com.example.estudos.repository;

import com.example.estudos.dto.UserCreateRequest;
import com.example.estudos.dto.UserResponse;
import com.example.estudos.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UsersEntity, Long> {
    Optional<UsersEntity> findByEmail(String email);
}
