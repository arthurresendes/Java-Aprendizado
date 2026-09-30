package com.example.estudos.service;

import org.springframework.stereotype.Service;

@Service
public class SaudacaoService {
    public String saudacao(String nome){
        return "Olá " + nome;
    }
}
