package com.seleniumexpress.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

    private Heart heart;

    @Autowired
    @Qualifier("humanHeart")
    public void setHeart(Heart heart) {
        this.heart = heart;
        System.out.println("setter method called");
    }

    public void startPumping() {
        if (heart != null) {
            heart.pump();
            System.out.println("name of the animal is: " + heart.getNameOfAnimal() +
                    " and it has" + heart.getNoOfHeart() + " hearts");
        } else {
            System.out.println("you are dead");
        }
    }
}
