package com.seleniumexpress.di;

public class Student {
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    private String studentName;


    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void displayStudentInfo(){
        System.out.println("Student name is " + studentName + " and the id is:" + id);
    }
}
