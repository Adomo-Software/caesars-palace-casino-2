package com.adomasda;

import java.util.ArrayList;
import java.util.Arrays;

public class FloorConfig {
    private ArrayList<Object> floorElements;

    public FloorConfig(Object... floorElements) {
        this.floorElements = new ArrayList<>(Arrays.asList(floorElements));
    }

    public ArrayList<Object> getFloorElements () {
        return this.floorElements;
    }
}