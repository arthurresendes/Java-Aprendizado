package com.example.estudos.service;

import com.example.estudos.dto.UserCreateRequest;
import com.example.estudos.dto.UserResponse;
import com.example.estudos.entity.UsersEntity;
import com.example.estudos.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

@Service // @Service serve para declarar ao Spring que é onde definimos a regra de negocio
@RequiredArgsConstructor
public class UserService {
    //private List<UserResponse> users = new CopyOnWriteArrayList<>();
    private final UserRepository userRepository;

    /*public UserResponse adicionarUsuario(UserCreateRequest user){
        UserResponse newUser = new UserResponse(user.name(), user.email());
        users.add(newUser);
        return newUser;
    }
    */

    // O @ Transactional é ou tudo da certo ou nada é salvo no banco de dados
    @Transactional
    public UserResponse adicionarUsuario(UserCreateRequest request){
        UsersEntity user = new UsersEntity(request.name(), request.email());
        UsersEntity salvo = userRepository.save(user);
        return new UserResponse(user.getId(),salvo.getName(), salvo.getEmail());
    }

    @Transactional
    public List<UserResponse> listagem(){
        return userRepository.findAll().stream().map(u -> new UserResponse(u.getId(),u.getName(), u.getEmail())).toList();
    }

    @Transactional
    public List<UserResponse> listagemPorEmail(String email){
        Optional<UsersEntity> user = userRepository.findByEmail(email);

        return user.stream().map(u -> new UserResponse(u.getId(), u.getName(), u.getEmail())).toList();
    }

    public void deletarUser(Long id){
        /*
        for (UserResponse user: users){
            if(user.getName().equals(nome)){
                users.remove(user);
            }
        }
        */
        userRepository.deleteById(id);
    }
}
