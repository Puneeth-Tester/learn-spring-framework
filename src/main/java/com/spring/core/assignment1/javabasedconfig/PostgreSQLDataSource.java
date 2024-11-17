package com.spring.core.assignment1.javabasedconfig;

public class PostgreSQLDataSource implements DataSource {

    @Override
    public String[] getEmails(){
        String[] emails = new String[] {"igh@gmail.com", "klm@gmail.com"};
        return emails;
    }
}
