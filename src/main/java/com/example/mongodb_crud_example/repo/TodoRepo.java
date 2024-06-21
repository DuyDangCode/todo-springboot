package com.example.mongodb_crud_example.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.mongodb_crud_example.model.TodoModel;

public interface TodoRepo extends MongoRepository<TodoModel, String> {

}