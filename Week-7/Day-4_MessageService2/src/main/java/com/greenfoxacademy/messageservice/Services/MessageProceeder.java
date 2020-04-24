package com.greenfoxacademy.messageservice.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Email;
import java.text.DateFormat;
import java.time.LocalDateTime;

@Service
public class MessageProceeder implements MessageService {

    @Override
    public void processMessage(String message, String recipient) {

           }
}
