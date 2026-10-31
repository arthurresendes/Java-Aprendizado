package com.exemplo.biblioteca.model.service;

import com.exemplo.biblioteca.model.entity.UserEntity;
import com.exemplo.biblioteca.model.repository.UserRepository;
import com.exemplo.biblioteca.view.dto.UserCreateRequest;
import com.exemplo.biblioteca.view.dto.UserResponse;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public List<UserResponse> verTodosUsers(){
        return userRepository.findAll().stream().map(us -> new UserResponse(us.getId(),us.getNome(),us.getEmail())).toList();
    }

    @Transactional
    public UserResponse cadastrarUser(UserCreateRequest request){
        UserEntity user = new UserEntity(request.nome(),request.email());
        UserEntity salvar = userRepository.save(user);
        return new UserResponse(salvar.getId(), salvar.getNome(), salvar.getEmail());
    }

    @Transactional
    public void deletarUser(Long id){
        userRepository.deleteById(id);
    }
}
