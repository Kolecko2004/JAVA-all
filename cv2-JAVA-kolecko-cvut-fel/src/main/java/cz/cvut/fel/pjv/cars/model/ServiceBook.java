package cz.cvut.fel.pjv.cars.model;

public class ServiceBook {
    private final int MAX_CAP = 5;
    private int numOfRecords = 0;

    public ServiceBook(Car car) {
        this.car = car;
        serviceRecord = new String[MAX_CAP];
        this.car.setSb(this);
    }

    private String[] serviceRecord;
    private Car car;

    public void addRecord(String record) {
        serviceRecord[numOfRecords++] = record;
    }

    @Override
    public String toString() {
        String text = "";

        for (int i = 0; i < numOfRecords; i++) {
            text += serviceRecord[i] + "\n";
        }

        return text;
    }
}
