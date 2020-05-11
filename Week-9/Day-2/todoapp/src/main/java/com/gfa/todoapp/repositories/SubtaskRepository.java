package com.gfa.todoapp.repositories;

import com.gfa.todoapp.models.Subtask;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubtaskRepository extends CrudRepository<Subtask, Long> {
}
