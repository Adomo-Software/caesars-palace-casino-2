package com.adomasda;

import com.adomasda.Floors.*;

public class Main {
    enum GameType {
        POKER,
        PACHINKO_MACHINE,
        SLOT_MACHINE,
        BLACKJACK
    }

    enum ServiceType {
        SPA,
        SHOP
    }


    public static void main(String[] args) {
        FloorConfig firstFloorConfig = new FloorConfig(
                GameType.BLACKJACK, GameType.SLOT_MACHINE, ServiceType.SPA);
        FloorConfig secondFloorConfig =
                new FloorConfig(GameType.PACHINKO_MACHINE,
                        GameType.PACHINKO_MACHINE, ServiceType.SHOP);
        AvailableFloor firstFloor = new FirstFloor(firstFloorConfig);
        AvailableFloor secondFloor = new SecondFloor(new FloorConfig(GameType.PACHINKO_MACHINE));
        AvailableFloor thirdFloor = new ThirdFloor(secondFloorConfig);
        AvailableFloor forthFloor = new FourthFloor(secondFloorConfig);

        Elevator elevator = new Elevator(firstFloor, secondFloor, thirdFloor, forthFloor);

//        elevator.goToFloor(2); // 1, skipping 2, 3
//        elevator.goToFloor(1); // 3, 2, 1
//        elevator.goToFloor(4); // 1, 2, 3, 4

    }
}
