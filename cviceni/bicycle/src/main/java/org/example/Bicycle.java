package org.example;

public class Bicycle {
    protected
    int cadence;
    protected int speed;
    protected int gear;
    protected BikeColor color;

    public Bicycle(int cadence, int speed, int gear, BikeColor color) {
        this.cadence = cadence;
        this.speed = speed;
        this.gear = gear;
        this.color = color;
    }


    public void printDescription() {
        System.out.println("Bike is in gear " + gear + " with a cadence of " + cadence +
                " and travelling at a speed of " + speed + ". Color: " + color);
    }

    public void visit(BicycleVisitable visitable) {
        visitable.accept(this);
    }
}
