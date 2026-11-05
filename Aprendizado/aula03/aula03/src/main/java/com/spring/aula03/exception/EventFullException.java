package com.spring.aula03.exception;

public class EventFullException extends RuntimeException{
    public EventFullException(){super("Evento lotado");}
    public EventFullException(String message){super(message);}
}
