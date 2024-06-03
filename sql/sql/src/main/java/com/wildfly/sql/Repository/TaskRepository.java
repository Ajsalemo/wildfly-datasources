package com.wildfly.sql.Repository;

import org.springframework.stereotype.Repository;

import com.wildfly.sql.Entities.TaskEntity;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, Integer> {
    
}
