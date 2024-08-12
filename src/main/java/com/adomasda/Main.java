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

        Elevator elevator = new Elevator();

        AvailableFloor _firstFloor = new FirstFloor(firstFloorConfig, elevator);
        AvailableFloor _secondFloor = new SecondFloor(new FloorConfig(GameType.PACHINKO_MACHINE), elevator);
        UnavailableFloor _thirdFloor = new ThirdFloor(secondFloorConfig, elevator);
        AvailableFloor _fourthFloor = new FourthFloor(secondFloorConfig, elevator);

        elevator.goToFloor(4);
    }
}
