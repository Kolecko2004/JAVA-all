package cz.cvut.fel.pjv.impl;

import cz.cvut.fel.pjv.StatsInterface;

import java.util.Scanner;

public class Stats implements StatsInterface {
    // TODO implement all methods from StatsInterface
    private static final Scanner sc = new Scanner(System.in);
    @Override
    public void addNumber(double number) {
        int idx = 0;
        while (sc.hasNextDouble()) {
            System.out.println(sc.nextDouble());
            idx++;
            if (idx == 10) {
                idx = 0;
                System.out.println("10");
            }
        }
        return;
    }

    @Override
    public double getAverage() {
        return 0;
    }

    @Override
    public double getStandardDeviation() {
        return 0;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public String getFormattedStatistics() {
        return "";
    }
}
