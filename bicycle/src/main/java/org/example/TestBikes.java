package org.example;

public class TestBikes {
    public static void main(String[] args) {
        Bicycle bike01 = new Bicycle(20, 10, 1, BikeColor.RED);
        MountainBike bike02 = new MountainBike(20, 10, 5, "Dual", BikeColor.BLUE);
        RoadBike bike03 = new RoadBike(40, 20, 8, 23, BikeColor.GREEN);

        bike01.printDescription();
        bike02.printDescription();
        bike03.printDescription();

        BasicService basicService = new BasicService();
        MountainBikeService mountainService = new MountainBikeService();
        RoadBikeService roadService = new RoadBikeService();

        bike01.visit(basicService);
        bike02.visit(mountainService);
        bike03.visit(roadService);
    }
}
