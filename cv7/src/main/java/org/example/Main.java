package org.example;

import org.example.idk.Calc;

import java.io.FileInputStream;
import java.util.logging.*;
import java.io.IOException;

public class Main {
    private static final Logger LOG = Logger.getLogger(Main.class.getName());
    private static final Handler HANDLER = new ConsoleHandler();

    public static void main(String[] args) throws IOException {
        Calc calc = new Calc();
//        LogManager.getLogManager().readConfiguration(new FileInputStream("C:\\C:\\Users\\ditad\\Documents\\Škola\\Semestr-2\\mat-analyza\\hello.txt"));
//        LOG.setLevel(Level.ALL);
//        HANDLER.setLevel(Level.ALL);
//        LOG.addHandler(HANDLER);

//        Logger.getLogger("").setLevel(Level.ALL);
//        Logger.getLogger("").getHandlers()[0].setLevel(Level.ALL);

        System.out.println("Hello World");
        LOG.severe("'Hello World!' was printed");
        LOG.info("'Hello World!' was printed");
        LOG.fine("'Hello World!' was printed");
        LOG.finest("'Hello World!' was printed");

        calc.div(1, 2);
    }
}