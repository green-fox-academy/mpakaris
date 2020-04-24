package com.greenfoxacademy.messageservice.Configuration;


import com.greenfoxacademy.messageservice.Services.EmailService;
import com.greenfoxacademy.messageservice.Services.MessageService;
import com.greenfoxacademy.messageservice.Services.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {

    @Bean(name="chosenService")
    public MessageService sendMail() {
        return new EmailService();
    }

    public MessageService sendMessage() {
        return new TwitterService();
    }

}
