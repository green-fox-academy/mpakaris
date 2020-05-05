package com.greenfoxacademy.restapi.Services;

import com.greenfoxacademy.restapi.Models.AllLogs;
import com.greenfoxacademy.restapi.Models.Log;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LogService {

    void createNewLog(String endpoint, String data);

    AllLogs getAllLogs();

    String reverseSentence(String originalSentence);

    List<Log> fetchTop10();

    List<Log> findLogsByParameters(String count, String page);

    List<Log> findLogsByKeyWord(String keyWord);


}
