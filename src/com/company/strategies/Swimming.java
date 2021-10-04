package com.company.strategies;

public class Swimming implements IMoving {
    @Override
    public String move() {
        return " by Swimming";
    }

    @Override
    public String toString() {
        return "Swimming";
    }
}
