package com.seleniumexpress.college;

import org.springframework.stereotype.Component;

@Component("collegeBean")
public class College {
    public void sayHi(){
        System.out.println("Hello my friends");
    }
}
