package com.animal.wipro.rest.api;

import com.animal.wipro.rest.api.language.SingHelper;

import com.animal.wipro.rest.api.util.SoundEnums;

public class Cat extends Mammal {
    public Cat() {
        super(new SingHelper(SoundEnums.CAT));
    }

    public Cat(SingHelper singHelper) {
        super(singHelper);
    }
}
