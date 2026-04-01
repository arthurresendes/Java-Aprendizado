package br.edu.fatecosasco.todolist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.fatecosasco.todolist.entity.Task;
import br.edu.fatecosasco.todolist.repository.TaskRepository;

@Service
public class TaskService {

	@Autowired
	private TaskRepository repository;
	
	public Task create(Task task) {
		return repository.save(task);
	}
	
}
