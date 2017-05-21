package com.example.demo;

import com.example.abc.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


import java.util.Arrays;

@ComponentScan({"com.example.abc", "com.example.demo"})
@SpringBootApplication
public class DemoApplication {

    @Bean
    public User user() {
        return new User("Dan", "Vega");

    }


    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }

//        System.out.println(ctx.getBean("user").toString());

    }
}
