package com.greenfoxacademy.foxclub.Services;

import com.greenfoxacademy.foxclub.Models.Trick;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrickService {

    private List<Trick> trickList = new ArrayList<>();

    public TrickService() {
        trickList.add(new Trick("Coding", "coding.jpg", 1));
        trickList.add(new Trick("Being Weird", "curious.jpg", 1));
        trickList.add(new Trick("Dancing", "dancing.jpg", 1));
        trickList.add(new Trick("High Five", "five.jpg", 1));
        trickList.add(new Trick("Surfing", "surfing.jpg", 1));
        trickList.add(new Trick("Lifting", "lifting.jpg", 1));
        trickList.add(new Trick("Riding", "riding.jpg", 1));
        trickList.add(new Trick("Painting", "painting.jpg", 1));
        trickList.add(new Trick("Skating", "tricks.jpg", 1));
        trickList.add(new Trick("Soccer", "soccer.jpg", 1));
        trickList.add(new Trick("Driving", "driving.jpg", 1));
        trickList.add(new Trick("Rapping", "rapping.jpg", 1));
    }

    public List<Trick> getTrickList() {
        return trickList;
    }

    public void setTrickList(List<Trick> trickList) {
        this.trickList = trickList;
    }
}
