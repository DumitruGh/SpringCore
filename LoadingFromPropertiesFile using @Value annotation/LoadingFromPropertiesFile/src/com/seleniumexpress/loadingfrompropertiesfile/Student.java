package com.seleniumexpress.loadingfrompropertiesfile;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {

    private String name;
    private String intrestedCourse;
    private String hobby;

    @Value("Dima")
    public void setName(String name) {
        this.name = name;
    }

    @Value("Java")
    public void setIntrestedCourse(String intrestedCourse) {
        this.intrestedCourse = intrestedCourse;
    }

    @Value("${student.hobby}")
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void displayInfo(){
        System.out.println("Student name " + name);
        System.out.println("Student intrestedcourse " + intrestedCourse);
        System.out.println("Student hobby " + hobby);
    }
}
