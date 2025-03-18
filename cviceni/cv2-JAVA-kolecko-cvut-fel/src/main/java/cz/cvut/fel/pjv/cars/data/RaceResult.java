package cz.cvut.fel.pjv.cars.data;
import cz.cvut.fel.pjv.cars.model.Car;

public class RaceResult {
    private Car car;

    public RaceResult(Car car, double time) {
        this.car = car;
        this.time = time;
    }

    private double time;

    public Car getCar() {
        return car;
    }

    public double getTime() {
        return time;
    }

    @Override
    public String toString() {
        return car + " - " + time;
    }
}
