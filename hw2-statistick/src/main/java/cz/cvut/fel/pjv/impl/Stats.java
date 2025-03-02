package cz.cvut.fel.pjv.impl;

import cz.cvut.fel.pjv.StatsInterface;

import java.util.ArrayList;

public class Stats implements StatsInterface {
    // TODO implement all methods from StatsInterface
    ArrayList<Double> numbersList = new ArrayList<>();


    @Override
    public void addNumber(double number) {
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
        double[] difArray = new double[getCount()];
        double average = getAverage();

        for (int idx = 0; idx < getCount(); idx++) {
            difArray[idx] = Math.pow(numbersList.get(idx) - average, 2);
        }

        double sum = 0;
        for (double num : difArray) {
            sum += num;
        }

        double newAverage = Math.sqrt(sum / getCount());
        nullValues();

        return newAverage;
    }

    @Override
    public int getCount() {
        return numbersList.size();
    }

    @Override
    public String getFormattedStatistics() {
        return "";
    }

    void nullValues() {
        numbersList.clear();
    }
}
