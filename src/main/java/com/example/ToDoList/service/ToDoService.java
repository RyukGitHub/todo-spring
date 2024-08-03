package com.example.ToDoList.service;

import com.example.ToDoList.model.ToDo;
import com.example.ToDoList.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {
    // Inject ToDoRepository
    @Autowired
    ToDoRepository toDoRepository;

    // Get all ToDos
    public List<ToDo> getToDos() {
        return toDoRepository.findAll();
    }

    // Post a ToDo
    public String postToDo(ToDo toDo) {
        ToDo toDoObj = new ToDo();
        toDoObj.setTitle(toDo.getTitle());
        toDoObj.setDescription(toDo.getDescription());
        toDoRepository.save(toDoObj);
        return "Posted ToDo successfully";
    }

    // Delete a ToDo by toDoId
    public String deleteToDo(String toDoId) {
        ToDo todo = toDoRepository.findById(toDoId).orElse(null);
        if (todo != null) {
            toDoRepository.deleteById(toDoId);
            return "Deleted ToDo successfully";
        } else {
            return "ToDo not found";
        }
    }
}
