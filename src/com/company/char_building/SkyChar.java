package com.company.char_building;

import com.company.strategies.IMoving;
import com.company.strategies.IResting;

public class SkyChar extends Character{

    String name;

    public SkyChar(IMoving charMoving, IResting charResting) {
        super(charMoving, charResting);
        name = "Sky Character";
        System.out.println(name + " is created");

    }

    public String getName() {
        return name;
    }

    @Override
    public String createElement() {
        return super.createElement() + " Sky";
    }

}
