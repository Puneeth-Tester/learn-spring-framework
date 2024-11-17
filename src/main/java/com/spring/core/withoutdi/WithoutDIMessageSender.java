package com.spring.core.withoutdi;

public class WithoutDIMessageSender {

    private WithoutDIMessageService withoutDIMessageService;

    public WithoutDIMessageSender(WithoutDIMessageService withoutDIMessageService) {
        this.withoutDIMessageService = withoutDIMessageService;
    }

    public void sendMessage(String message){
        this.withoutDIMessageService.sendMessage(message);
    }
}
