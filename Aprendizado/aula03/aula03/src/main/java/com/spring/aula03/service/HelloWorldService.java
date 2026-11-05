package com.spring.aula03.service;

import com.spring.aula03.domain.User;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String olaMundo(String name){
        return "Hello World " + name;
    }

    public String helloWorldPost(User us){
        return "Hello World Post. " + us.getNome() + " trabalha como " + us.getProfissao();
    }
    public String olaMundoFilter(){
        return "Hello World ";
    }


}
