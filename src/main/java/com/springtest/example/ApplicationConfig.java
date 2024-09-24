package com.springtest.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {
    //@Bean(name = "myBean")//by using name property we can give name to bean
    @Bean
    //@Qualifier("bean1")
    public MyFirstClass myFirstClass() {
        return new MyFirstClass("First Bean");
    }

    @Bean
    //@Qualifier("bean2")
    public MyFirstClass mySecondClass() {
        return new MyFirstClass("Second Bean");
    }

    @Bean
    //@Qualifier("bean2")
    //@Primary// this annotation will give priority for this bean
    public MyFirstClass myThirdClass() {
        return new MyFirstClass("Third Bean");
    }

}
