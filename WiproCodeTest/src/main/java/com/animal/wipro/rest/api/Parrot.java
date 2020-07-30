package com.animal.wipro.rest.api;

import com.animal.wipro.rest.api.features.Flyable;

import com.animal.wipro.rest.api.language.LanguageHelper;


import com.animal.wipro.rest.api.language.SingHelper;
import com.animal.wipro.rest.api.util.Constant;
import com.animal.wipro.rest.api.util.SoundEnums;

public class Parrot extends Bird implements Flyable {
    public Parrot() {
        super(new SingHelper(SoundEnums.DEFAULT));
    }

    public Parrot(SingHelper singHelper) {
        super(singHelper);
    }

    public void canFly() {
        System.out.println(Constant.I_AM_FLYING);
    }
}
