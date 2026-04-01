package br.edu.fatecosasco.todolist;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecosasco.todolist.controller.TaskController;

@RestController
@SpringBootApplication
public class TodolistApplication {

	public static void main(String[] args) {
		TaskController task = new TaskController();
		SpringApplication.run(TodolistApplication.class, args);
	}

}
