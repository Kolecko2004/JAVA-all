package cz.cvut.fel.pjv.impl;
import cz.cvut.fel.pjv.TextIO;
//import cz.cvut.fel.pjv.impl.Stats;

import java.util.Objects;

public class Lab02 {
   public static void main(String[] args) {
      TextIO textIO = new TextIO();
      Stats stats = new Stats();
      String line = "some";
      int numOfScannedLines = 1;

      while (!line.isEmpty()) {
         line = textIO.getLine();
         boolean isDouble = TextIO.isDouble(line);

         if (!isDouble) {
            if (Objects.equals(line, "\n")) {
               System.out.println("A number has not been parsed from line " + numOfScannedLines + "\n" + "End of input detected!");
            }
            System.out.println("End of input detected!");
            break;
         }

         stats.addNumber(Double.parseDouble(line));

         numOfScannedLines++;
      }

      System.out.printf("%d %.3f %.3f", stats.getCount(), stats.getAverage(), stats.getStandardDeviation());

   }
}