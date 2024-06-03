package com.wildfly.mysql.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wildfly.mysql.Entities.TaskEntity;
import com.wildfly.mysql.Repository.TaskRepository;


@RestController
public class GetAllTasksController {
    @Autowired
    private TaskRepository tasksRepository;

    @GetMapping("/api/tasks/all")
    public List<TaskEntity> getAllTasks() {
        System.out.println("here");
        return tasksRepository.findAll();
    }
    
}
