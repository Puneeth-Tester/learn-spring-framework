package com.spring.core.assignment1.annotationbasedconfig;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("postgreSQLDataSource")
@Primary
public class PostgreSQLDataSource implements DataSource{

    @Override
    public String[] getEmails(){
        String[] emails = new String[] {"igh@gmail.com", "klm@gmail.com"};
        return emails;
    }
}
