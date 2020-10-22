package com.drinking_fountain;

import java.util.Random;

public class Cup {

    private int volume;

    public Cup() {
        setRandomVolume();
    }

    private void setRandomVolume() {
        Random random = new Random();
        this.volume = random.nextInt(10);
    }

    public int getVolume() {
        return volume;
    }
}
