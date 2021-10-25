//Ayaan Ajmal - September 24

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    PillowCase p = new PillowCase();
    Scanner s = new Scanner(System.in);
    System.out.println("Happy Halloween! How many houses should we trick or treat at?");
    int rand = s.nextInt();
    int q = 0; while (q < rand) {p.getCandy();q++;}
    p.printNumCandie();
  }
}