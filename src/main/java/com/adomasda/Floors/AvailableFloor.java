package com.adomasda.Floors;

import com.adomasda.Elevator;
import com.adomasda.FloorConfig;

public class AvailableFloor extends Floor {
    public AvailableFloor(FloorConfig floorConfig, Elevator elevator, int number) {
        super(floorConfig, elevator, number);
        elevator.addAvailableFloor(this);
    }
}
