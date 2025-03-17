package org.example;

public enum BikeColor {
    RED("Red", 1), BLUE("Blue", 2), GREEN("Green", 3);

    private final String name;
    private final int id;

    BikeColor(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return name + " (ID: " + id + ")";
    }
}
