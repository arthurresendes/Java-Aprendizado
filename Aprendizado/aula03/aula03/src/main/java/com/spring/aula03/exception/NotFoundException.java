package com.spring.aula03.exception;

public class NotFoundException extends RuntimeException {
    public NotFoundException(){super("Não encontrado");}
    public NotFoundException(String message){super(message);}
}
