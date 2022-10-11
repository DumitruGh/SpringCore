package com.seleniumexpress.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {

                                        //Objects injection without Spring
              /* Student student = new Student();
               MathCheat cheat = new MathCheat();
               student.setMathCheat(cheat);
               student.cheating();*/

                                    //Objects injection with Spring
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = context.getBean("stu", Student.class);
        student.cheating();

        AnotherStudent another = context.getBean("anotherstudent", AnotherStudent.class);
        another.startCheating();
    }
}
