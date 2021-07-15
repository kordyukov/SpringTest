package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class
        );
       SpringTest springTest = context.getBean("springTest",SpringTest.class);

       springTest.setName("Hello1");

        SpringTest springTest1 = context.getBean("springTest",SpringTest.class);
        springTest1.setName("Hello2");

        System.out.println(springTest.getName() + " " + springTest1.getName());

        context.close();





    }
}
