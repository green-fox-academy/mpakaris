package com.greenfoxacademy.messageservice.Services;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class EmailService implements MessageService {

    @Override
    public void processMessage(String message, String recipient) {
        System.out.println(LocalDateTime.now() + ": Sent to <" + recipient + "> with Message: '" + message + "' via E-Mail Service");
    }
}
