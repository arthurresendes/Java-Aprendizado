package com.example.estudos.controller;

import com.example.estudos.dto.UserCreateRequest;
import com.example.estudos.dto.UserResponse;
import com.example.estudos.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Define que é o controller + conversão automatica para JSON
@RequiredArgsConstructor // Gera construtor para os campos final (injetar o service)
@RequestMapping("/users") // Rota base ou prefix
public class UserController {
    private final UserService userService;

    // @Valid verifica as regras
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponse criar(@Valid @RequestBody UserCreateRequest body){
        return userService.adicionarUsuario(body);
    }

    @GetMapping
    public List<UserResponse> listar(){
        return userService.listagem();
    }

    @DeleteMapping("/{nome}")
    public ResponseEntity<Void> deletando(@PathVariable String nome){
        userService.deletarUser(nome);
        return ResponseEntity.noContent().build();
    }

}
