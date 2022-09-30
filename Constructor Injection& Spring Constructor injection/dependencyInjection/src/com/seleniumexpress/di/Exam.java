package com.seleniumexpress.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
    public static void main(String[] args) {

                                            //Constructor injection without spring
  /*     Student abhi = new Student(1, "Abhilash");
       abhi.displayStudentInfo();*/

                                          //Constructor injection with Spring
           ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
           Student abhi = context.getBean("student", Student.class);
           abhi.displayStudentInfo();

           Student abo = context.getBean("dilip", Student.class);
           abo.displayStudentInfo();



    }
}
