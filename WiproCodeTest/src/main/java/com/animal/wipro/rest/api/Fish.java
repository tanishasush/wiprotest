package com.animal.wipro.rest.api;

import com.animal.wipro.rest.api.features.BodyType;

import com.animal.wipro.rest.api.features.Swimmable;
import com.animal.wipro.rest.api.util.Constant;

public class Fish extends Animal implements Swimmable, BodyType {
    public void canSwim() {
        System.out.println(Constant.I_AM_SWIMMING);
    }

    public String bodySize() {
        return null;
    }

    public String bodyColor() {
        return null;
    }
}
