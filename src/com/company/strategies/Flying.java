package com.company.strategies;

public class Flying implements IMoving {
    @Override
    public String move() {
        return " by Flying";
    }

    @Override
    public String toString() {
        return "Flying";
    }
}
