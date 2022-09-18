package org.mvc.models;

import java.util.Random;

public enum De {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6);

    public int value;
    private static final Random RANDOM = new Random();
    De(int value){
        this.value = value;
    }

    public static De getRandomValue() {
        De[] values = values();

        return values[RANDOM.nextInt(values.length)];
    }
}
