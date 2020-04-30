package com.greenfoxacademy.redditclone.Repositories;

import com.greenfoxacademy.redditclone.Models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
