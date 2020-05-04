package com.greenfoxacademy.restapi.Services;

import com.greenfoxacademy.restapi.Models.AllLogs;
import com.greenfoxacademy.restapi.Models.Log;
import org.springframework.stereotype.Service;

@Service
public interface LogService {

    void createNewLog(String endpoint, String data);

    AllLogs getAllLogs();

}
