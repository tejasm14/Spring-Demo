package com.springtest.example;

import org.springframework.stereotype.Component;

/*
* Here we can use three annotations @Component or @Service or @Repository to mark the class as a spring bean
* */
//@Component
public class MyFirstClass {
    private String myVar;
    public MyFirstClass(String myVar) {
        this.myVar = myVar;
    }

    public String sayHello() {
        return  "Hello this is my first class ==> myVar = "+myVar;
    }
}
