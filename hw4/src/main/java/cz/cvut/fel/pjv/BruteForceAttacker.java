package cz.cvut.fel.pjv;
import cz.cvut.fel.pjv.Thief;

public class BruteForceAttacker extends Thief {
   public void breakPassword(int sizeOfPassword) {
      char[] chars = getCharacters();
      System.out.println(chars);

      char[] guessed = new char[sizeOfPassword];
      for (int idx = 0; idx <= sizeOfPassword - 1; idx++) {
         guessed[idx] = chars[0];
      }

      while (true) {
         System.out.println(new String(guessed)); // Print current guess

         // Try to open the vault
         if (tryOpen(guessed)) {
            return; // Stop if the password is found
         }

         // Increment the guessed password like counting
         if (!increment(guessed, chars)) {
            break; // If we reach the last combination, stop
         }
      }
   }

   // Increments the guessed password like a number in a different base
   private boolean increment(char[] guessed, char[] chars) {
      for (int i = guessed.length - 1; i >= 0; i--) {
         int index = findIndex(chars, guessed[i]); // Find current character index in chars

         if (index < chars.length - 1) {
            guessed[i] = chars[index + 1]; // Move to the next character
            return true; // Successfully incremented
         } else {
            guessed[i] = chars[0]; // Reset and move to the next position
         }
      }
      return false; // If we fully wrapped around, we are done
   }

   // Finds the index of a character in the chars array
   private int findIndex(char[] chars, char c) {
      for (int i = 0; i < chars.length; i++) {
         if (chars[i] == c) {
            return i;
         }
      }
      return -1; // Should never happen
   }
}
