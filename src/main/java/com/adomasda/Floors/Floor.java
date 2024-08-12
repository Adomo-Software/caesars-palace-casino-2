package com.adomasda.Floors;

import com.adomasda.Elevator;
import com.adomasda.FloorConfig;

public abstract class Floor {
    FloorConfig floorConfig;
    private int number;

    Floor(FloorConfig floorConfig, int number) {
        this.floorConfig = floorConfig;
        this.number = number;
    }

    abstract boolean isAvailable();
    int getNumber() { return this.number; }
}