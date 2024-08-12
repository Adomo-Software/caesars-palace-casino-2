package com.adomasda.Floors;

import com.adomasda.Elevator;
import com.adomasda.FloorConfig;

public class UnavailableFloor extends Floor {
    UnavailableFloor(FloorConfig floorConfig, Elevator elevator, Integer number) {
        super(floorConfig, elevator, number);
        elevator.addUnavailableFloor(this);
    }
}