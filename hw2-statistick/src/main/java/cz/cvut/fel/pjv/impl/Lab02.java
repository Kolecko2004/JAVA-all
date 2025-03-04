package cz.cvut.fel.pjv.impl;
import cz.cvut.fel.pjv.TextIO;

public class Lab02 {
   public static void main(String[] args) {
      TextIO textIO = new TextIO();
      Stats stats = new Stats();

      int numOfScannedLines = 0;

      while (true) {
         String line = textIO.getLine();
         numOfScannedLines++;

         if (line.isEmpty()) {
            break;
         }

         boolean isDouble = TextIO.isDouble(line);

         if (!isDouble) {
            System.err.println("A number has not been parsed from line " + numOfScannedLines);
         } else {
            stats.addNumber(Double.parseDouble(line));
            if (stats.getCount() == 10) {
               System.out.println(stats.getFormattedStatistics());
            }
         }


      }

      System.err.println("End of input detected!");

      if (stats.getCount() > 1 && stats.getCount() < 10) {
         System.out.println(stats.getFormattedStatistics());
      }

   }
}