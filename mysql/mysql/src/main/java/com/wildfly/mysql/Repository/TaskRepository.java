package com.wildfly.mysql.Repository;

import org.springframework.stereotype.Repository;

import com.wildfly.mysql.Entities.TaskEntity;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, Integer> {
    
}
