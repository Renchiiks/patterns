package com.company.strategies;

public class Walking implements IMoving {
    @Override
    public String move() {
        return " by Walking";
    }

    @Override
    public String toString() {
        return "Walking";
    }
}
