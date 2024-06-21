package com.example.mongodb_crud_example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "todos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TodoModel {
  @Id
  private String id;
  private String title;
  private String description;
  private boolean isDelete;

}
