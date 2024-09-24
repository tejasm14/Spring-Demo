package com.springtest.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MySecondService {

    @Autowired
    @Qualifier("mySecondClass")
    private MyFirstClass myFirstClass;

    public String tellAStory() {
        return "Dependency injection is saying : "+myFirstClass.sayHello();
    }

}
