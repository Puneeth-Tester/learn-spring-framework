package com.spring.core.withoutdi;

public class WithoutDISMSService implements WithoutDIMessageService {
    @Override
    public void sendMessage(String message){
        System.out.println(message);
    }
}
