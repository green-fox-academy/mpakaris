package com.greenfoxacademy.demo.Services;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class UtilityService {

    private List<String> colors;
    private Random random;

    public UtilityService() {
        colors = new ArrayList<>();
        colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("lime");
        colors.add("orange");
        colors.add("magenta");
        random = new Random();
    }

    // returns random color as a String
    public String randomColor() {
        return colors.get(random.nextInt(colors.size()));
    }

    public String encode (String text, int number) {
        if (number < 0) {
            number = 26 + number;
        }

        String result = "";
        for (int i = 0; i < text.length(); i++) {
            int offset = Character.isUpperCase(text.charAt(i)) ? 'A' : 'a';
            result += (char) (((int) text.charAt(i) + number - offset) % 26 + offset);
        }
        return result;
    }

    public String decode (String text, int number) {
        Character ch;
        String result = "";
        for(int i = 0; i < text.length(); ++i){
            ch = text.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch - number);
                if(ch < 'a'){
                    ch = (char)(ch + 'z' - 'a' + 1);
                }
                result += ch;
            }
            else if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch - number);

                if(ch < 'A'){
                    ch = (char)(ch + 'Z' - 'A' + 1);
                }
                result += ch;
            }
            else {
                result += ch;
            }
        }
        return result;
    }


    public boolean validate(String mail) {
        if (mail.contains(".") && mail.contains("@")) {
            return true;
        } else {
            return false;
        }
    }

}
