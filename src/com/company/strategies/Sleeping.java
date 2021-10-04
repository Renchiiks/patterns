package com.company.strategies;

public class Sleeping implements IResting {
    @Override
    public String rest() {
        return " by sleeping";
    }

    @Override
    public String toString() {
        return "Sleeping";
    }
}
