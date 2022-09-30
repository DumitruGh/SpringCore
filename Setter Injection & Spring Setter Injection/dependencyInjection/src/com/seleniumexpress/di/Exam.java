package com.seleniumexpress.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
    public static void main(String[] args) {

                                            //Setter injection without spring
        /*Student student = new Student();
        student.setStudentName("Dima");
        student.displayStudentInfo();*/

                                          //Setter injection with Spring
           ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
           Student abhi = context.getBean("student", Student.class);
           Student ashi = context.getBean("ashish", Student.class);
           abhi.displayStudentInfo();
           ashi.displayStudentInfo();

           //cand in file-ul bean scrii numele fieldului <property name= "studentName", Spring va cauta
           // automat un seter pentru acest field cu ajutorul caruia va crea obiectul. Deci daca seterul tau
           // nu are numele setStudentName ci, de exemplu, setabStudentName, atunci obiectul nu se va crea. Genial.


    }
}
