package com.adomasda.Floors;

import com.adomasda.Elevator;
import com.adomasda.FloorConfig;

public class SecondFloor extends AvailableFloor {
    public SecondFloor(FloorConfig floorConfig, Elevator elevator) {
        super(floorConfig, elevator, 2);
    }
}