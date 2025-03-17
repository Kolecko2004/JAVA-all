package org.example;

public class BasicService {
    @Override
    public void accept(Bicycle b) {
        System.out.println("Fixing Bicycle");
    }

    @Override
    public void accept(MountainBike mb) {
        System.out.println("Can't fix MountainBike");
    }

    @Override
    public void accept(RoadBike rb) {
        System.out.println("Can't fix RoadBike");
    }
}
