package org.example;

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // 1st homework in JAVA - calculator - Vojtech Drozd
        System.out.println("Vyber operaci (1-soucet, 2-rozdil, 3-soucin, 4-podil):");
        boolean isItInt = sc.hasNextInt();
        if (!isItInt) {
            System.out.println("Chybna volba!");
            return;
        }

        switch(sc.nextInt()) {
            case 1:
                sum();
                break;
            case 2:
                substract();
                break;
            case 3:
                multiplication();
                break;
            case 4:
                division();
                break;
            default:
                System.out.println("Chybna volba!");
        }
    }

    public static void print_result(double num1, double num2, double result) {
        int decimalPlaces;

        System.out.println("Zadej pocet desetinnych mist:");
        boolean isItInt = sc.hasNextInt();
        if (!isItInt) {
            System.out.println("ERROR: inputed number is not int!");
            return;
        }

        decimalPlaces = sc.nextInt();

        System.out.printf("Výsledek: %." + decimalPlaces + "f", result);
    }

    public static void sum() {
        System.out.println("scitani");
        double[] sumNumberArray = new double[2];
        double sumResult;

        for (int idx = 0; idx < 2; idx++) {
            System.out.println("Zadej scitanec:");
            boolean isItDouble = sc.hasNextDouble();
            if (!isItDouble) {
                System.out.println("ERROR: inputed number is not double!");
                return;
            }
            sumNumberArray[idx] = sc.nextDouble();
        }

        sumResult = sumNumberArray[0] + sumNumberArray[1];
        print_result(sumNumberArray[0], sumNumberArray[1], sumResult);
    }

    public static void substract() {
        System.out.println("2");
    }

    public static void multiplication() {
        System.out.println("3");
    }

    public static void division() {
        System.out.println("4");
    }
}