package cz.cvut.fel.pjv;

import java.util.Scanner;

public final class TextIO {
    private final Scanner scanner = new Scanner(System.in);
    static int numOfScannedLines = 0;

    public TextIO() {

    }

//    public int processLine() {
//        int numberFromLine;
//        numOfScannedLines++;
//        String newLine = getLine();
//
//        if (!newLine.isEmpty()) {
//            if (isInteger(newLine)) {
//                numberFromLine = Integer.parseInt(newLine);
//                return numberFromLine;
//            } else {
//                System.out.println("A number has not been parsed from line " + numOfScannedLines + "\n" + "End of input detected!");
//                return 0;
//            }
//        }
//
//        return 0;
//    }

    /**
     * Get next line from stdin
     *
     * @return text from stdin, or "" if no line is present
     */
    public String getLine() {
        return scanner.hasNext() ? scanner.nextLine() : "";
    }

    /**
     * Check if the provided string is a valid integer
     *
     * @param s string to be checked
     * @return true if valid integer, false otherwise
     */
    public static boolean isInteger(String s) {
        boolean ret = true;
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            ret = false;

        }
        return ret;
    }

    /**
     * Check if the provided string is a valid double
     *
     * @param s string to be checked
     * @return true if valid double, false otherwise
     */
    public static boolean isDouble(String s) {
        boolean ret = true;
        try {
            Double.parseDouble(s);
        } catch (NumberFormatException e) {
            ret = false;
        }
        return ret;
    }
} 
