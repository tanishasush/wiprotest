package com.animal.wipro.rest.api;

import com.animal.wipro.rest.api.features.Flyable;

import com.animal.wipro.rest.api.features.Swimmable;
import com.animal.wipro.rest.api.language.SingHelper;
import com.animal.wipro.rest.api.util.Constant;
import com.animal.wipro.rest.api.util.SoundEnums;

public class Duck extends Bird implements Swimmable, Flyable {

    public Duck() {
        super(new SingHelper(SoundEnums.DUCK));
    }

    @Override
    public void canWalk() {
        super.canWalk();
    }

    public void canFly() {
        System.out.println(Constant.I_AM_FLYING);
    }

    public void canSwim() {
        System.out.println(Constant.I_AM_SWIMMING);
    }
}
