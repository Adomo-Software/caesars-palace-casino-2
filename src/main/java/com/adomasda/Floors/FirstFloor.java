package com.adomasda.Floors;

import com.adomasda.Elevator;
import com.adomasda.FloorConfig;

public class FirstFloor extends AvailableFloor {
    public FirstFloor(FloorConfig floorConfig, Elevator elevator) {
        super(floorConfig, elevator, 1);
    }
}