package com.greenfoxacademy.restapi.Services;

import com.greenfoxacademy.restapi.Models.AllLogs;
import com.greenfoxacademy.restapi.Models.Log;
import com.greenfoxacademy.restapi.Repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

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

    @Override
    public List<Log> fetchTop10() {
        List<Log> listLogsTop10 = new ArrayList<>();
        logRepo.selectTopTen().forEach(listLogsTop10::add);
        return listLogsTop10;
    }

    @Override
    public List<Log> findLogsByParameters(String entries, String page) {
        List<Log> allLogs = new ArrayList<>();
        logRepo.findAll().forEach(allLogs::add);
        int countLogs = Integer.parseInt(entries);
        int pageNumber = Integer.parseInt(page);
        List<Log> returnLogs = new ArrayList<>();
        for (int i = (pageNumber*countLogs)-countLogs; i <pageNumber*countLogs;i++) {
            if (i < allLogs.size()) {
                returnLogs.add(allLogs.get(i));
            } else {
                break;
            }
        }
       return returnLogs;
    }

    @Override
    public List<Log> findLogsByKeyWord(String keyWord) {
        List<Log> allLogs = new ArrayList<>();
        logRepo.findAll().forEach(allLogs::add);
        List<Log> returnLogs = allLogs
                                .stream()
                                .filter(log -> log.getData().contains(keyWord) || log.getEndpoint().contains(keyWord))
                                .collect(Collectors.toList());
        if (returnLogs == null) {
            return null;
        }
        return returnLogs;
    }

    @Override
    public List<Log> fetch10NativeSQL() {
        List<Log> returnLogs = logRepo.selectTopTen();
        return returnLogs;
    }

    @Override
    public List<Log> findLogsByKeyWordNative(String keyWord) {
        List<Log> resultLog = logRepo.selectByKeyWord(keyWord);
        return resultLog;
    }

    @Override
    public List<Log> findLogsByParametersNative(String entries, String page) {
        int entriesNumber = Integer.parseInt(entries);
        int pageNumber = Integer.parseInt(page);
        int limitBottom = (entriesNumber*pageNumber)+ 1 - entriesNumber;
        int limitTop = (entriesNumber*pageNumber)+1;
        List<Log> resultLogs = logRepo.selectByPagination(limitBottom, limitTop);
        return resultLogs;
    }

    @Override
    public String reverseSentence(String originalSentence) {
        String replace = originalSentence.toLowerCase().replaceAll("[{|}|\n|\t|\"]", "");
        List<String> split = new ArrayList<>(Arrays.asList(replace.split("\\.")));
        String newResult = "";
        for (String phrase : split) {
            List<String> words = Arrays.asList(phrase.split(" "));
            for (int i = 0; i < words.size() - 1; i += 2) {
                newResult += words.get(i + 1) + " " + words.get(i) + " ";
            }
            if (words.size() % 2 != 0) {
                newResult += words.get(words.size() - 1);
            }
            newResult += ". " + randomWords() + " ";
        }
        return newResult;
    }

    private String randomWords() {
        List<String> randomWords= new ArrayList<String>();
        randomWords.add("Aaaargh.");
        randomWords.add("Eeerm. Eeeerm.");
        randomWords.add("Aware you must stay!");
        randomWords.add("Listening you must.");
        randomWords.add("Danger danger!");
        randomWords.add("mjamm mjamm.");
        randomWords.add("mumble.");
        randomWords.add("Sith are not far.");
        randomWords.add("Green you still are!");
        randomWords.add("Padawan you must stay.");
        Random random = new Random();
        int i = random.nextInt(randomWords.size());
        return randomWords.get(i);
    }
}
