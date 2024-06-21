package com.example.mongodb_crud_example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.mongodb_crud_example.model.TodoModel;
import com.example.mongodb_crud_example.repo.TodoRepo;

@Service
public class TodoService {
  private TodoRepo todoRepo;

  public TodoService(TodoRepo todoRepo) {
    this.todoRepo = todoRepo;
  }

  public TodoModel addTodo(TodoModel todo) {
    return this.todoRepo.save(todo);
  }

  public List<TodoModel> getAllTodo() {
    return this.todoRepo.findAll();
  }

  public Optional<TodoModel> getTodoById(String todoId) {
    return this.todoRepo.findById(todoId);
  }

}
