package com.company.elements;

public abstract class Element {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void elementCreation() {
        System.out.println("Element " );
    }

}
