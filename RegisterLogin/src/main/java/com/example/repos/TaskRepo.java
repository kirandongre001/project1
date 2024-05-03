package com.example.repos;

import com.example.models.Registration;
import com.example.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepo extends JpaRepository<Task,Integer> {
}
