package com.greenfoxacademy.restapi.Repositories;

import com.greenfoxacademy.restapi.Models.Log;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogRepository extends CrudRepository<Log, Long> {

    @Query(value = "SELECT * FROM log LIMIT 10", nativeQuery =true)
    List<Log> selectTopTen();

    @Query(value = "SELECT * FROM log WHERE data = ?1", nativeQuery =true)
    List<Log> selectByKeyWord(String keyWord);

    @Query(value = "SELECT * FROM log WHERE LIMIT ?1 OFFSET ?2 ORDER BY id", nativeQuery =true)
    List<Log> selectByPagination(int bottomLimit, int topLimit);

}
