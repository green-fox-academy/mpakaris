package com.greenfoxacademy.mysql.Repository;

import com.greenfoxacademy.mysql.Model.Asignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsigneeRepository extends CrudRepository<Asignee, Long> {
}
