package com.drinking_fountain;

import java.util.Random;

public class Cup {

    private final int volume;

    public Cup() {
        Random random = new Random();
        this.volume = random.nextInt(10);
    }

    public int getVolume() {
        return volume;
    }
}
