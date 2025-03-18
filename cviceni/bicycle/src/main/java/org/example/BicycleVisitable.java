package org.example;

public interface BicycleVisitable {
    void accept(Bicycle b);
    void accept(MountainBike b);
    void accept(RoadBike b);
}