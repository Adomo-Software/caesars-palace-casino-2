package com.adomasda.Floors;

import com.adomasda.Elevator;
import com.adomasda.FloorConfig;

public class AvailableFloor extends Floor {
    AvailableFloor(FloorConfig floorConfig, int number) {
        super(floorConfig, number);
    }

    @Override
    public boolean isAvailable() {
        return true;
    }
}
