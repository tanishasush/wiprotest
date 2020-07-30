package com.animal.wipro.rest.api;

import com.animal.wipro.rest.api.features.Flyable;

import com.animal.wipro.rest.api.features.Speakable;
import com.animal.wipro.rest.api.features.Walkable;
import com.animal.wipro.rest.api.language.SingHelper;
import com.animal.wipro.rest.api.util.Constant;

public class Insect extends Animal implements Flyable, Walkable, Speakable {
    private SingHelper singHelper;

    public Insect(SingHelper singHelper) {
        this.singHelper = singHelper;
    }

    public void canFly() {
        System.out.println(Constant.I_AM_FLYING);
    }

    public void callSound() {
        singHelper.makeSound();
    }

    public void canWalk() {
        System.out.println(Constant.I_AM_WALKING);
    }
}
