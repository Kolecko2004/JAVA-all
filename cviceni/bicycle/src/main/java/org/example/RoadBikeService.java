package org.example;

public class RoadBikeService extends BasicService{
    @Override
    public void accept(RoadBike rb) {
        System.out.println("Fixing RoadBike");
    }

    @Override
    public void accept(Bicycle b) {
        System.out.println("RoadBikeService can't fix " + b.getClass().getSimpleName());
    }
}
