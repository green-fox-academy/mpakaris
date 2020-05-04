package com.greenfoxacademy.new_todoapp.Repositories;

import com.greenfoxacademy.new_todoapp.Models.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {
}
