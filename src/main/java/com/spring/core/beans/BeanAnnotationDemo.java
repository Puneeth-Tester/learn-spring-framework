package com.spring.core.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

class Student{
    private Address address;

    public Student(Address address) {
        this.address = address;
    }

    public void print(){
        System.out.println("Student Class - print() Method ..");
        address.print();
    }

    public void init(){
        System.out.println("init()");
    }

    public void destroy(){
        System.out.println("destroy()");
    }
}

class Address{
    public void print(){
        System.out.println("Address Class - print() Method ..");
    }
}

@Configuration
class AppConfig{

    @Bean(name="addressBean")
    public Address address(){
        return new Address();
    }

    // @Bean(name = {"studentBean", "studentDemo"})
    @Bean(name = "studentBean", initMethod = "init", destroyMethod = "destroy")
    public Student student(){
        return new Student(address());
    }
}

@ComponentScan(basePackages = "com.spring.core.beans")
public class BeanAnnotationDemo {

    public static void main(String[] args) {
        try(var applicationContext = new AnnotationConfigApplicationContext(BeanAnnotationDemo.class)){
            // Student student = applicationContext.getBean(Student.class);
            Student student = (Student) applicationContext.getBean("studentBean");
            String[] beans = applicationContext.getBeanDefinitionNames();
            for(String bean : beans){
                System.out.println(bean);
            }
            student.print();
        }
    }
}
