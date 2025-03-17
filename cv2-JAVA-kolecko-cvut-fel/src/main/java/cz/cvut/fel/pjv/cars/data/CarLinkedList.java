package cz.cvut.fel.pjv.cars.data;

import cz.cvut.fel.pjv.cars.model.Car;

public class CarLinkedList {
    CarListNode start = null;
    private int length = 0;

    public Car[] toArray() {
        Car[] cars = new Car[length];
        CarListNode tmp = start;

        for (int idx = 0; idx < length; idx++) {
            cars[idx] = tmp.car;
            tmp = tmp.next;
        }

        return cars;
    }

    public void addCar(Car car) {
        start = new CarListNode(car, start);
        length++;
    }
}
