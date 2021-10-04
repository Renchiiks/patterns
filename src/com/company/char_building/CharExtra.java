package com.company.char_building;

public  abstract class CharExtra extends Character {
    Character character;

    public CharExtra(Character character) {
        super(character.getMoving(), character.getResting());
        System.out.println(" has extra skills");
        this.character = character;
    }

    @Override
    public String createElement(int elementType) {

        return super.createElement(elementType);
    }
}
