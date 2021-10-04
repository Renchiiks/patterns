package com.company.elements;

import java.util.ArrayList;

public class Plant extends Element {
    ArrayList<Element> elementComponents = new ArrayList();
    private String name;

    public Plant() {
        this.name = "Plant";
        elementCreation();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void elementCreation() {
        super.elementCreation();

        System.out.println(" of type " + getName());
    }


}
