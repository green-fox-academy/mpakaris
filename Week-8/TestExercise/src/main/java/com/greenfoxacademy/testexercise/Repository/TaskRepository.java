package com.greenfoxacademy.testexercise.Repository;

import com.greenfoxacademy.testexercise.Models.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {
}
