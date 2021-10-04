package com.company.elements;

public class ElementFactory {
    public Element makeElement(int newElementType) {

        Element element;
        if (newElementType == 1) {
            element = new Animal();

        } else if (newElementType == 2) {
            element = new Plant();

        }else{
            element = null;
        }

        return element;
    }
}
