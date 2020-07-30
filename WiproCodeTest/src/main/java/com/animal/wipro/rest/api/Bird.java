package com.animal.wipro.rest.api;

import  com.animal.wipro.rest.api.features.Flyable;

import com.animal.wipro.rest.api.features.Speakable;
import com.animal.wipro.rest.api.features.Walkable;
import com.animal.wipro.rest.api.language.SingHelper;
import com.animal.wipro.rest.api.util.Constant;
import com.animal.wipro.rest.api.util.SoundEnums;

public class Bird extends Animal implements Walkable, Speakable, Flyable {

    private SingHelper singHelper;

    public Bird() {
        this.singHelper = new SingHelper(SoundEnums.DEFAULT);
    }

    public Bird(SingHelper singHelper) {
        this.singHelper = singHelper;
    }

    public void callSound() {
        singHelper.makeSound();
    }

    public void canWalk() {
        System.out.println(Constant.I_AM_WALKING);
    }


    public void canFly() {
        System.out.println(Constant.I_AM_FLYING);
    }
}
