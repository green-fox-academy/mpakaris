package com.gfa.todoapp.repositories;

import com.gfa.todoapp.models.Assignee;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.support.CrudMethodMetadata;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Long> {
}
