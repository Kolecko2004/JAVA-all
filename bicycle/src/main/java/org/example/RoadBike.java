package org.example;

public class RoadBike extends Bicycle{
    private final int tireWidth;

    public RoadBike(int cadence, int speed, int gear, int tireWidth, BikeColor color) {
        super(cadence, speed, gear, color);
        this.tireWidth = tireWidth;
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("Tire Width: " + tireWidth + "mm");
    }

    public void visit(BicycleVisitable visitable) {
        visitable.accept(this);
    }
}
