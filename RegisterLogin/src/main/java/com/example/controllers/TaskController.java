package com.example.controllers;

import com.example.models.Login;
import com.example.models.Task;
import com.example.services.TaskService;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class TaskController {
    @Autowired
    private TaskService tservice;

    @GetMapping("/tasks")
    public ResponseEntity<List<Task>> getalltasks(){
        return ResponseEntity.ok(tservice.getAlltasks());
    }

    @GetMapping("/tasks/{tid}")
    public ResponseEntity<Task> getalltasks(@PathVariable int tid){
        Task t=tservice.getById(tid);
        if(t!=null)
            return ResponseEntity.ok(t);
        else
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @PostMapping("/tasks/{tid}")
    public ResponseEntity<String> addtask(@RequestBody Task t){
        tservice.addnewTask(t);
        return ResponseEntity.ok("Data added successfully");
    }

    @PutMapping("/tasks/{tid}")
    public ResponseEntity<String> updateTask(@RequestBody Task t){
        tservice.updateById(t);
        return ResponseEntity.ok("Data modified successfully");
    }

    @DeleteMapping("/tasks/{tid}")
    public ResponseEntity<String> deleteTask(@PathVariable int tid){
        tservice.deleteById(tid);
        return ResponseEntity.ok("Data deleted successfully");
    }
}
