package com.seleniumexpress.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        College college = context.getBean("collegeBean", College.class);
        college.sayHi();

        University university = context.getBean("univ", University.class);
        university.newLife();
    }
}
