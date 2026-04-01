package br.edu.fatecosasco.todolist.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.fatecosasco.todolist.entity.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Integer>{

}
