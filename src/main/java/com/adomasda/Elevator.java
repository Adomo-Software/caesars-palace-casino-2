package com.adomasda;

import com.adomasda.Floors.AvailableFloor;
import com.adomasda.Floors.Floor;
import com.adomasda.Floors.UnavailableFloor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Elevator {

    public List<Integer> availableFloors = new ArrayList<>();
    public HashMap<Integer ,Floor> unavailableFloors = new HashMap<>();

    public void addAvailableFloor(AvailableFloor availableFloor) {
        this.availableFloors.add(availableFloor.getNumber());
    }
    public void addUnavailableFloor(UnavailableFloor availableFloor) {
        this.unavailableFloors.put(availableFloor.getNumber(), availableFloor);
    }
    public void goToFloor(int floorNumber) {
        assert !unavailableFloors.containsKey(floorNumber);
        availableFloors.removeIf(floor -> floor > floorNumber);
        for (Integer floor : availableFloors) {
            System.out.println(floor);
        }
    }
}