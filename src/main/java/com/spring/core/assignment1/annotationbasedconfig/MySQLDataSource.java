package com.spring.core.assignment1.annotationbasedconfig;

import org.springframework.stereotype.Component;

@Component("mySQLDataSource")
public class MySQLDataSource implements DataSource{

    @Override
    public String[] getEmails(){
        String[] emails = {"abc@gmail.com", "def@gmail.com"};
        return emails;
    }
}
