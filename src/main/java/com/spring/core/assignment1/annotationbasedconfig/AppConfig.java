package com.spring.core.assignment1.annotationbasedconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.core.assignment1.annotationbasedconfig")
public class AppConfig {
}
