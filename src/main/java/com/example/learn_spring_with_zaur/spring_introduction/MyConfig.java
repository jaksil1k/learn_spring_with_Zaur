package com.example.learn_spring_with_zaur.spring_introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan("com.example.learn_spring_with_zaur.spring_introduction")
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Pet catBean(){
        return new Cat();
    }

    @Bean
    public Person personBean(){
        return new Person(catBean());
    }


}
