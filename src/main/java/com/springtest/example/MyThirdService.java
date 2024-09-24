package com.springtest.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyThirdService {

    private MyFirstClass myFirstClass;

    @Autowired
    public void injectDependency(@Qualifier("myThirdClass") MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

    public String tellAStory() {
        return "Dependency injection is saying : "+myFirstClass.sayHello();
    }

}
