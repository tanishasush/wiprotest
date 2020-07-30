package com.animal.wipro.rest.api.controllers;


import com.animal.wipro.rest.api.Animal;


import com.animal.wipro.rest.api.misc.AnimalCount;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AnimalController {
    @RequestMapping(method = RequestMethod.GET, value = "/animal/getFlyingAnimalCount")
    @ResponseBody
    public int getFlyingAnimalCount(@RequestBody Animal[] animals) {
        AnimalCount animalCount = new AnimalCount(animals);
        int flyingAnimal = animalCount.getFlyingAnimal();
        return flyingAnimal;
    }
}
