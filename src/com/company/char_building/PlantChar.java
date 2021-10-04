package com.company.char_building;

public class PlantChar extends CharExtra{
    String name;

    public PlantChar(Character character) {
        super(character);
        name = "of Plants";
        System.out.println(" of type Animal");
    }

    @Override
    public String getName() {
        return name;
    }
}
