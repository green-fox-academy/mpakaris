package com.greenfoxacademy.restapi.Repositories;

import com.greenfoxacademy.restapi.Models.Log;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogRepository extends CrudRepository<Log, Long> {

    @Query(value = "SELECT * FROM log ORDER BY created_at DESC", nativeQuery =true)
    List<Log> selectTopTen();


}
