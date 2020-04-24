package com.greenfoxacademy.messageservice.Services;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TwitterService implements MessageService {

    @Override
    public void processMessage(String message, String recipient) {
        System.out.println(LocalDateTime.now() + ": Sent to <" + recipient + "> with Message: '" + message + "' via Twitter");

    }
}
