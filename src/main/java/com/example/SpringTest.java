package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class SpringTest {
private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void doMyInit(){
        System.out.println("Init");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Destroy");
    }

//@Autowired
    //public SpringTest() {

   // }
}
