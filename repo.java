package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(collectionResourceRel = "tasks",path="tasks")
public interface repo extends JpaRepository<task,Long>{
    
}
