package org.example;

public class MountainBikeHolder {
    public MountainBikeHolder(MountainBike bicycle) {
        super(bicycle);
    }

    @Override
    public String toString() {
        return "Mountain Bike Holder holding " + bicycle;
    }
}
