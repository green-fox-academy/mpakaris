package com.greenfoxacademy.mysql.Repository;

import com.greenfoxacademy.mysql.Model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
