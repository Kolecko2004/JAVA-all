package cz.cvut.fel.pjv.cars.model;

import java.util.Objects;
import java.util.UUID;

public class Car {

    private int year;
    private String manufacturer;
    private String modelName;

    public ServiceBook getServiceBook() {
        return sb;
    }

    private UUID vinCode;
    static private int numberOfExistingCars;
    private Engine engine;
    private ServiceBook sb;

     void setSb(ServiceBook sb) {
        if (sb != null) {
            this.sb = sb;
        }
    }

    public Car(String manufacturer, String modelName, int year) {
        vinCode = UUID.randomUUID();
        this.modelName = modelName;
        this.manufacturer = manufacturer;
        this.year = year;
        numberOfExistingCars++;
    }

    public Car(String manufacturer, String modelName, int year, String engineType) {
        this(manufacturer, modelName, year); // musi byt jako prvni noveho konctruktoru nemuze byt dole!!!!!!!!!
        this.engine = new Engine(engineType);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(manufacturer, car.manufacturer) && Objects.equals(modelName, car.modelName) && Objects.equals(vinCode, car.vinCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, vinCode);
    }

    public UUID getVinCode() {
        return vinCode;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModelName() {
        return modelName;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return manufacturer + ' ' + modelName + ' ' + year + " VIN:" + vinCode;
    }

    public static int getNumberOfExistingCars() {
        return numberOfExistingCars;
    }
}
