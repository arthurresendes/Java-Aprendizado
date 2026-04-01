package br.edu.fatecosasco.todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecosasco.todolist.entity.Task;
import br.edu.fatecosasco.todolist.service.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {
	@Autowired
	private TaskService service;

	@GetMapping
	public ResponseEntity<Task> find(){
		   Task t = new Task(1, "Estudar Java");
		   return ResponseEntity.ok(t);
	}
	
	@PostMapping
	public ResponseEntity<Task> create(@RequestBody Task task){
		Task created = service.create(task);
		return ResponseEntity.ok(created);
	}

}
