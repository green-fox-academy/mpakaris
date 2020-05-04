package com.greenfoxacademy.examexercise.Repository;

import com.greenfoxacademy.examexercise.Model.Link;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkRepository extends CrudRepository<Link, Long> {
}
