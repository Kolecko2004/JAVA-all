package cz.cvut.fel.pjv;

public class BruteForceAttacker extends Thief {

   public void breakPassword(int sizeOfPassword) {
      char[] chars = getCharacters();
      char[] guessed = new char[sizeOfPassword];
      bruteForceRecursive(guessed, chars, 0);
   }

   private boolean bruteForceRecursive(char[] guessed, char[] chars, int index) {
      if (index == guessed.length) {
         return tryOpen(guessed);
      }

      for (char c : chars) {
         guessed[index] = c;
         if (bruteForceRecursive(guessed, chars, index + 1)) {
            return true;
         }
      }

      return false;
   }
}
