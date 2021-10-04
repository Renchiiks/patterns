package com.company.elements;

import java.util.ArrayList;

public class Animal extends Element {
    private String name;


    public Animal() {
        this.name = "Animal";
        elementCreation();

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void elementCreation() {
        super.elementCreation();

        System.out.println("of type " + getName());
    }

}
