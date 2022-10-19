package com.seleniumexpress.college;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {

    @Bean  //the id of the bean(id means the name of the bean) will be the name of the method, collegeBean
    public College collegeBean(){
        College college = new College();
        return college;
    }
}
