package com.example.ToDoList.controller;

import com.example.ToDoList.model.ToDo;
import com.example.ToDoList.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/todos")
@RestController
public class ToDoController {
    // Inject ToDoService
    @Autowired
    ToDoService toDoService;

    // Get all ToDos
    @GetMapping
    public List<ToDo> getToDos() {
        return toDoService.getToDos();
    }

    // Post a ToDo
    @PostMapping
    public String postToDo(@RequestBody ToDo toDo) {
        return toDoService.postToDo(toDo);
    }

    // Delete a ToDo by toDoId
    @DeleteMapping("/{toDoId}")
    public String deleteToDo(@PathVariable String toDoId) {
        return toDoService.deleteToDo(toDoId);
    }

}
