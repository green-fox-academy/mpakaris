package com.greenfoxacademy.foxclub.Services;

import com.greenfoxacademy.foxclub.Model.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {

    private List<Fox> listOfFoxes;

    public void addStartingFox() {
       if (listOfFoxes == null) {
           this.listOfFoxes = new ArrayList<>();
           listOfFoxes.add(new Fox("DummyFox"));
       }
    }

    public String logIn(String foxName) {
        String answer = "";
        for (int i = 0; i < listOfFoxes.size(); i++) {
            if (listOfFoxes.get(i).getName().equals(foxName)) {
                answer = "alreadyExists";
            } else {
                listOfFoxes.add(new Fox(foxName));
                answer =  "createdNewFox";
            }
        }
        return answer;
   }
}
