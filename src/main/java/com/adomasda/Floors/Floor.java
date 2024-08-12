package com.adomasda.Floors;

import com.adomasda.Elevator;
import com.adomasda.FloorConfig;

public abstract class Floor {
    FloorConfig floorConfig;
    private final int number;

    Floor(FloorConfig floorConfig, Elevator elevator, int number) {
        this.floorConfig = floorConfig;
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }
}