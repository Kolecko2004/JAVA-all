package org.example;

public class Main {
    public static void main(String[] args) {

        MySingleton.getInstance().setData(100);
        System.out.println(MySingleton.getInstance().getData());
    }
}