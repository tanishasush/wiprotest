package com.animal.wipro.rest.api;

import com.animal.wipro.rest.api.features.Swimmable;

import com.animal.wipro.rest.api.util.Constant;

public class Dolphin extends Animal implements Swimmable {
    public void canSwim() {
        System.out.println(Constant.I_AM_SWIMMING);
    }
}
