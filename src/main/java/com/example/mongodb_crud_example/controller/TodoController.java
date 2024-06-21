package com.example.mongodb_crud_example.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.example.mongodb_crud_example.model.TodoModel;
import com.example.mongodb_crud_example.service.TodoService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class TodoController {
  private TodoService todoService;

  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }

  @GetMapping("/")
  public List<TodoModel> getAllTodo() {
    return this.todoService.getAllTodo();
  }

  @PostMapping("/")
  public TodoModel postMethodName(@RequestBody TodoModel todo) {
    return this.todoService.addTodo(todo);
  }

}
