package com.spring.core;

import com.spring.core.controller.DemoController;
import com.spring.core.repository.DemoRepository;
import com.spring.core.service.DemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoClient {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(applicationContext.getBean(DemoController.class).hello());
        System.out.println(applicationContext.getBean(DemoService.class).hello());
        System.out.println(applicationContext.getBean(DemoRepository.class).hello());
    }
}
