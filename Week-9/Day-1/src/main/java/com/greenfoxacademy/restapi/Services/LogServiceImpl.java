package com.greenfoxacademy.restapi.Services;

import com.greenfoxacademy.restapi.Models.AllLogs;
import com.greenfoxacademy.restapi.Models.Log;
import com.greenfoxacademy.restapi.Repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LogServiceImpl implements LogService {

    @Autowired
    LogRepository logRepo;

    @Override
    public void createNewLog(String endpoint, String data) {

        logRepo.save(new Log(endpoint, data));

    }

    @Override
    public AllLogs getAllLogs() {
        List<Log> allLogs = new ArrayList<>();
        logRepo.findAll().forEach(allLogs::add);
        return new AllLogs(allLogs);
    }
}
