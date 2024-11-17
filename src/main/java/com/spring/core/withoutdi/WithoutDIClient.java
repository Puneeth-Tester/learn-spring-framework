package com.spring.core.withoutdi;

public class WithoutDIClient {

    public static void main(String[] args) {

        String message = "Hi, good morning hava a nice day!.";

        WithoutDISMSService withoutDISMSService = new WithoutDISMSService();
        WithoutDIEmailService withoutDIEmailService = new WithoutDIEmailService();
        WithoutDIMessageSender withoutDIMessageSender = new WithoutDIMessageSender(withoutDIEmailService);
        withoutDIMessageSender.sendMessage(message);

    }
}
