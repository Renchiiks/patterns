package com.company.char_building;

import com.company.elements.Element;
import com.company.elements.ElementFactory;
import com.company.strategies.IMoving;
import com.company.strategies.IResting;

public abstract class Character {
    Element elementList;
    String name;

    public Character(IMoving charMoving, IResting charResting) {

        this.moving = charMoving;
        this.resting = charResting;

    }

    IMoving moving;
    IResting resting;

    public IMoving getMoving() {
        return moving;
    }

    public IResting getResting() {
        return resting;
    }

    public String getName() {
        return name;
    }

    public String createElement(int elementType) {
        ElementFactory elementFactory = new ElementFactory();
        elementFactory.makeElement(elementType);

        return "has been created";
    }

    public String createElement() {

        return " created element of type";
    }



}
