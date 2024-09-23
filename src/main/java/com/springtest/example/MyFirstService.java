package com.springtest.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    private final MyFirstClass myFirstClass;

    @Autowired
    public MyFirstService(MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    } // this is called constructor dependency injection. This Constructor DI can be run without @Autowired annotation

    public String tellAStory() {
        return "Dependency injection is saying : "+myFirstClass.sayHello();
    }

}
