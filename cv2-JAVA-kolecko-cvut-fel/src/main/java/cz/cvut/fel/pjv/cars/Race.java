package cz.cvut.fel.pjv.cars;

import cz.cvut.fel.pjv.cars.data.CarLinkedList;
import cz.cvut.fel.pjv.cars.data.CarListNode;
import cz.cvut.fel.pjv.cars.data.RaceResult;
import cz.cvut.fel.pjv.cars.model.Car;

public class Race {
    private int length;
    private CarLinkedList cll;
    private RaceResult[] rr;
    private boolean raceEnded = false;

    public boolean addRacingCar(Car car) {
        this.cll.addCar(car);
        length++;
        RaceResult result = new RaceResult(car, length);

        return true;
    }

    public Car getWinner() {
        RaceResult winner =
        return ;
    }

    public double getWinningTime() {

        return ;
    }

    private RaceResult[] getRaceResult() {

        return rr;
    }

    @Override
    public String toString() {
        return "Race{}";
    }

}
