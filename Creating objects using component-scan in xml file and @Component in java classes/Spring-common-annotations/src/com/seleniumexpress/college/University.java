package com.seleniumexpress.college;

import org.springframework.stereotype.Component;

@Component("univ")  // this id the id which we should introduce in our getBean method from Client
public class University {
    public void newLife(){
        System.out.println("University started");
    }
}
