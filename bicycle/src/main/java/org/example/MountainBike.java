package org.example;

public class MountainBike extends Bicycle{
    private final String suspension;

    public MountainBike(int cadence, int speed, int gear, String suspension, BikeColor color) {
        super(cadence, speed, gear, color);
        this.suspension = suspension;
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("Suspension: " + suspension);
    }

    public void visit(BicycleVisitable visitable) {
        visitable.accept(this);
    }
}
