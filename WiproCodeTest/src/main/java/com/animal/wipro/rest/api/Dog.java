package com.animal.wipro.rest.api;

import com.animal.wipro.rest.api.language.SingHelper;

import com.animal.wipro.rest.api.util.SoundEnums;

public class Dog extends Mammal {
    public Dog() {
        super((new SingHelper(SoundEnums.DOG)));
    }

    public Dog(SingHelper singHelper) {
        super(singHelper);
    }
}
