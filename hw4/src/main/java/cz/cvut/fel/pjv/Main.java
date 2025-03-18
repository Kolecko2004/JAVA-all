package cz.cvut.fel.pjv;

public class Main {
   public static void main(String[] args) {
      BruteForceAttacker attacker = new BruteForceAttacker();
      attacker.init(new char[]{'a', 'b', 'c', 'd'}, "abc");
      attacker.breakPassword(5);
   }
}
