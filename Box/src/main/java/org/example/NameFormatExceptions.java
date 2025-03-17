package org.example;

public class NameFormatExceptions extends Exception {
    public String data;

    public NameFormatExceptions(String message) {
        super(message);
    }
}

