package com.greenfoxacademy.gfa.Services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private List<String> names;

    public StudentService() {
       this.names = new ArrayList<>();
       names.add("Sanyi");
       names.add("Lilla");
       names.add("John");
    }

    public List<String> findAll() {
        return this.names;
    }

    public void save(String student) {
        names.add(student);
    }

    public int count() {
        return names.size();
    }

    public String check(String givenName) {
        if (names.contains(givenName)) {
            return "exist";
        } else {
            return "noExist";
        }
    }
}
