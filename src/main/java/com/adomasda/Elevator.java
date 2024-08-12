package com.adomasda;

import com.adomasda.Floors.Floor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Elevator {
    private final ArrayList<Floor> floors;
    private List<Floor> passedFloors = new ArrayList<>();

    public Elevator(Floor... floors) {
        this.floors = new ArrayList<>(Arrays.asList(floors));
    }

    public void goToFloor(int floorNumber) {
        // TODO
    }
}