package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class SpringTest {
private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//@Autowired
    //public SpringTest() {

   // }
}
