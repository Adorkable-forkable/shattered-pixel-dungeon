package com.shatteredpixel.shatteredpixeldungeon;

public enum Difficulty {
    INSTANCE;

    private boolean consumeAnkh = true;
    private boolean hunger = true;

    public synchronized void consumeAnkh(boolean value) {
        consumeAnkh = value;
    }

    public synchronized boolean willConsumeAnkh() {
        return consumeAnkh;
    }

    public synchronized void hunger(boolean value) {
        hunger = value;
    }

    public synchronized boolean willHunger() {
        return hunger;
    }
}
