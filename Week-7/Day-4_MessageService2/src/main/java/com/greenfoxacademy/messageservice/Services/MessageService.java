package com.greenfoxacademy.messageservice.Services;

import org.springframework.stereotype.Service;

@Service
public interface MessageService {

  void processMessage(String message, String recipient);

}
