package com.adomasda.Floors;

import com.adomasda.Elevator;
import com.adomasda.FloorConfig;

public class UnavailableFloor extends Floor {
    UnavailableFloor(FloorConfig floorConfig, int number) {
        super(floorConfig, number);
    }

    @Override
    public boolean isAvailable() {
        return true;
    }
}