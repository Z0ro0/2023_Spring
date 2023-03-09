package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public Person myPerson(){//myPerson(메서드)이 bean의 이름이 됨
        Person p = new Person("John", 20);
        p.setSomething("something");
        return p;
    }
}
