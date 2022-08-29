package com.example.learn_spring_with_zaur.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.example.learn_spring_with_zaur.aop")
@EnableAspectJAutoProxy
public class MyConfig {

}
