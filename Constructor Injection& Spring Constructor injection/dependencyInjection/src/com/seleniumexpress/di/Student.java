package com.seleniumexpress.di;

public class Student {
    private int id;


    private String studentName;

    public Student(int id, String studentName) {
        this.id = id;
        this.studentName = studentName;
    }

    public Student(int id){
        this.id = id;
    }

    public void displayStudentInfo(){
        System.out.println("Student name is " + studentName + " and the id is:" + id);
    }
}
