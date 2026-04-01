package br.edu.fatecosasco.todolist.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tasks")
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String description;
	
	public Task() {
		}
	public Task(Integer id, String description) {
		this.id = id;
		this.description = description;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	
}
