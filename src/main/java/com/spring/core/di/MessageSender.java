package com.spring.core.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

    private MessageService messageService;

    private MessageService smsService;

    public MessageSender(@Qualifier("emailService") MessageService messageService) {
        this.messageService = messageService;
        System.out.println("Constructor based DI");
    }

    @Autowired
    public MessageSender(@Qualifier("emailService") MessageService messageService,
                         @Qualifier("smsService") MessageService smsService) {
        this.messageService = messageService;
        this.smsService = smsService;
        System.out.println("Two Parameter Constructor based DI");
    }

    public void sendMessage(String message){
        this.messageService.sendMessage(message);
        this.smsService.sendMessage(message);
    }
}
