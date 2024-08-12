package com.adomasda.Floors;

import com.adomasda.Elevator;
import com.adomasda.FloorConfig;

public class ThirdFloor extends UnavailableFloor {
    public ThirdFloor(FloorConfig floorConfig, Elevator elevator) {
        super(floorConfig, elevator, 3);
    }
}