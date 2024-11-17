package com.spring.core.withoutdi;

public class WithoutDIEmailService implements WithoutDIMessageService{

    @Override
    public void sendMessage(String message){
        System.out.println(message);
    }
}
