package com.greenfoxacademy.foxclub.Services;

import com.greenfoxacademy.foxclub.Model.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {

    private List<Fox> listOfFoxes;
    private Fox fox;

    public void addStartingFox() {
       if (listOfFoxes == null) {
           this.listOfFoxes = new ArrayList<>();
           listOfFoxes.add(new Fox("Dummy"));
       }
    }

    public Fox logIn(String foxName) {
        String answer = "";
        Fox selectFox = null;
        for (int i = 0; i < listOfFoxes.size(); i++) {
            if (listOfFoxes.get(i).getName().equals(foxName)) {
                selectFox = listOfFoxes.get(i);
                break;
            } else {
                selectFox = new Fox(foxName);
                listOfFoxes.add(selectFox);
                answer =  "noExist";
                break;
            }
        }
        return selectFox;
   }
}
