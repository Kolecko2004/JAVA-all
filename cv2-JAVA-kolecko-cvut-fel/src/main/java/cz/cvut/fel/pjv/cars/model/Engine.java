package cz.cvut.fel.pjv.cars.model;

public class Engine {
    public Engine(String type) {
        this.type = type;
    }

    private String type;

    @Override
    public String toString() {
        return type;
    }
}
