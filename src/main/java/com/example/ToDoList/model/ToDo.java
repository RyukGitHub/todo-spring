package com.example.ToDoList.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Document
public class ToDo {
    @Id
    @Generated
    private String toDoId;
    private String title;
    private String description;
}
