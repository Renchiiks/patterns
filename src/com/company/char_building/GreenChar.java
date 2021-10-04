package com.company.char_building;

import com.company.strategies.IMoving;
import com.company.strategies.IResting;

public class GreenChar extends Character {

    String name;

    public GreenChar(IMoving charMoving, IResting charResting) {
        super(charMoving, charResting);
        name = "Green Character";
        System.out.println(name + " is created");

    }

    public String getName() {
        return name;
    }

    @Override
    public String createElement() {
        return super.createElement() + " Green";
    }
}
