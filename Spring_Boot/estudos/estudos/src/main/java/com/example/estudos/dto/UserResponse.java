package com.example.estudos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Gera getter, settter, toString, equals e hashCode
@AllArgsConstructor // Construtor com todos os campos
@NoArgsConstructor // Construtor vazio com os campos null
public class UserResponse {
    private String name;
    private String email;
}
