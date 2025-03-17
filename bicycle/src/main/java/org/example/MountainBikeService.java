package org.example;

public class MountainBikeService {
    public void accept(MountainBike mb) {
        System.out.println("Fixing MountainBike");
    }

    public void accept(Bicycle b) {
        System.out.println("MountainBikeService can't fix " + b.getClass().getSimpleName());
    }
}
