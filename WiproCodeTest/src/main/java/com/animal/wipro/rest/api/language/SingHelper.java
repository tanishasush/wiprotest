package com.animal.wipro.rest.api.language;


import com.animal.wipro.rest.api.util.SoundEnums;

public class SingHelper {
    private SoundEnums soundEnums;

    public SingHelper(SoundEnums soundEnums) {
        this.soundEnums = soundEnums;
    }

    public void makeSound() {
        System.out.println(soundEnums.getSound());
    }
}
