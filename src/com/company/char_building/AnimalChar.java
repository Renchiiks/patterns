package com.company.char_building;

public class AnimalChar extends CharExtra {
    String name;

    public AnimalChar(Character character) {
        super(character);
        name = "Animal Character";
        System.out.println(" of type Animal");
    }

    @Override
    public String getName() {
        return name;
    }

}
