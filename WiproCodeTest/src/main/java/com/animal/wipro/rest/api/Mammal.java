package com.animal.wipro.rest.api;

import com.animal.wipro.rest.api.features.Speakable;

import com.animal.wipro.rest.api.features.Walkable;
import com.animal.wipro.rest.api.language.SingHelper;
import com.animal.wipro.rest.api.util.Constant;
import com.animal.wipro.rest.api.util.SoundEnums;

public abstract class Mammal extends Animal implements Walkable, Speakable {
    private SingHelper singHelper;

    public Mammal() {
        this.singHelper = new SingHelper(SoundEnums.DEFAULT);
    }

    public Mammal(SingHelper singHelper) {
        this.singHelper = singHelper;
    }

    public void callSound() {
        singHelper.makeSound();
    }

    public void canWalk() {
        System.out.println(Constant.I_AM_WALKING);
    }
}
