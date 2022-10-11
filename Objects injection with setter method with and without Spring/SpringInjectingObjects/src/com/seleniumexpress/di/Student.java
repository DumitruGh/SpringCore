package com.seleniumexpress.di;

public class Student {

    private int id;

    public void setId(int id) {
        this.id = id;
    }

   private MathCheat mathCheat;

    public void setMathCheat(MathCheat mathCheat) {
        this.mathCheat = mathCheat;
    }
    public void cheating(){
        mathCheat.mathCheat();
        System.out.println("hey my id is " + id);
    }
}
