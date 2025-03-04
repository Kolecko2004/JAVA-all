package cz.cvut.fel.pjv.impl;
import cz.cvut.fel.pjv.StatsInterface;
import java.util.ArrayList;

public class Stats implements StatsInterface {
    ArrayList<Double> numbersList = new ArrayList<>();

    @Override
    public void addNumber(double number) {
        if (getCount() == 10) {
            nullValues();
        }
        numbersList.add(number);
    }

    @Override
    public double getAverage() {
        double sum = 0;
        for (double num : numbersList) {
            sum += num;
        }

        return sum / getCount();
    }

    @Override
    public double getStandardDeviation() {
        double sum = 0;

        for (int idx = 0; idx < getCount(); idx++) {
            sum += Math.pow(numbersList.get(idx) - getAverage(), 2);
        }

        return Math.sqrt(sum / getCount());
    }

    @Override
    public int getCount() {
        return numbersList.size();
    }

    @Override
    public String getFormattedStatistics() {
        return String.format("%2d %.3f %.3f", getCount(), getAverage(), getStandardDeviation());
    }

    void nullValues() {
        numbersList.clear();
    }
}
