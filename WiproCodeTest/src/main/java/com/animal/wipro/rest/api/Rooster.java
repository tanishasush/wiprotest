package com.animal.wipro.rest.api;

import com.animal.wipro.rest.api.language.LanguageHelper;


import com.animal.wipro.rest.api.language.SingHelper;
import com.animal.wipro.rest.api.util.LanguageEnums;
import com.animal.wipro.rest.api.util.SoundEnums;

public class Rooster extends Chicken {
    LanguageHelper languageHelper;
    SingHelper singHelper;
    LanguageEnums languageEnums;

    public Rooster() {
        this.singHelper = new SingHelper(SoundEnums.ROOSTER);
    }

    public Rooster(LanguageEnums languageEnums) {
        this.singHelper = new SingHelper(SoundEnums.ROOSTER);
        this.languageEnums = languageEnums;
    }

    @Override
    public void canFly() {
        super.canFly();
    }

    @Override
    public void callSound() {
        String translate = LanguageHelper.translate(SoundEnums.ROOSTER.getSound(), languageEnums);
        System.out.println(translate);

    }
}
