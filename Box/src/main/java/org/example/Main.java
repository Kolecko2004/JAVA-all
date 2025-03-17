package org.example;

public class Main {
    public static void main(String[] args) {


        try {
            Contact me = new Contact("A", "Drozd", "342 323 323", "kolecko 32", 20);
            System.out.println(me);
        }
        catch(NameFormatExceptions e) {
            System.out.println("Something went wrong " + e);
        }

    }
}