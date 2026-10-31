package com.exemplo.biblioteca.controller.controller;

import com.exemplo.biblioteca.model.service.UserService;
import com.exemplo.biblioteca.view.dto.UserCreateRequest;
import com.exemplo.biblioteca.view.dto.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @GetMapping
    public List<UserResponse> verTodosUsers(){
        return userService.verTodosUsers();
    }

    @PostMapping
    public UserResponse cadastrarUser(@RequestBody UserCreateRequest request){
        return userService.cadastrarUser(request);
    }

    @DeleteMapping("/{id}")
    public void deletarUser(@PathVariable Long id){
        userService.deletarUser(id);
    }

}

