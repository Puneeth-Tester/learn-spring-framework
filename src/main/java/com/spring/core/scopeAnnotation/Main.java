package com.spring.core.scopeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception{

        ApplicationContext context = new AnnotationConfigApplicationContext(ShoppingListConfig.class);

        Device lenovo = context.getBean("lenovo", Device.class);
        Device dell = context.getBean("dell", Device.class);
        Device moto = context.getBean("moto", Device.class);
        Device iQ = context.getBean("iQ", Device.class);


        ShoppingList list1 = context.getBean("shoppingList", ShoppingList.class);
        list1.addItem(lenovo);
        list1.addItem(moto);
        System.out.println("Shopping List 1 contains below items:");
        System.out.println(list1.getItems());

        ShoppingList list2 = context.getBean("shoppingList", ShoppingList.class);
        list2.addItem(dell);
        System.out.println("Shopping List 2 contains below items:");
        System.out.println(list2.getItems());

        ShoppingList list3 = context.getBean("shoppingList", ShoppingList.class);
        list3.addItem(iQ);
        list3.addItem(moto);
        System.out.println("Shopping List 3 contains below items:");
        System.out.println(list3.getItems());

    }
}
