package org.example;
import java.util.ArrayList;
import java.util.List;

public class Car implements BicycleVisitable {
    private List<BicycleHolder> carHolders = new ArrayList<>(4);

    @Override
    public void accept(Bicycle b) {
        carHolders.add(new BicycleHolder(b));
    }

    @Override
    public void accept(MountainBike b) {
        carHolders.add(new MountainBikeHolder(b));
    }

    @Override
    public void accept(RoadBike b) {
        carHolders.add(new RoadBikeHolder(b));
    }

    @Override
    public String toString() {
        return "Car holds " + carHolders.size() + " bikes.";
    }
}
