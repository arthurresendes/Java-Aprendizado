package com.example.estudos.service;

import com.example.estudos.dto.UserCreateRequest;
import com.example.estudos.dto.UserResponse;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Service // @Service serve para declarar ao Spring que é onde definimos a regra de negocio
public class UserService {
    private List<UserResponse> users = new CopyOnWriteArrayList<>();

    public UserResponse adicionarUsuario(UserCreateRequest user){
        UserResponse newUser = new UserResponse(user.name(), user.email());
        users.add(newUser);
        return newUser;
    }

    public List<UserResponse> listagem(){
        return users;
    }

    public void deletarUser(String nome){
        /*
        for (UserResponse user: users){
            if(user.getName().equals(nome)){
                users.remove(user);
            }
        }
        */
        users.removeIf(user -> user.getName().equals(nome));
    }
}
