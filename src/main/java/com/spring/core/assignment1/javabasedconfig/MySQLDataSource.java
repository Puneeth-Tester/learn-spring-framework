package com.spring.core.assignment1.javabasedconfig;


public class MySQLDataSource implements DataSource {

    @Override
    public String[] getEmails(){
        String[] emails = {"abc@gmail.com", "def@gmail.com"};
        return emails;
    }
}
