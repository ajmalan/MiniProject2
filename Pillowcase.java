
// Ayaan Ajmal - September 24
import java.util.ArrayList;
import java.util.Random;

class PillowCase {
  String candy;// instance variable for the candy name.
  int number;// instance variable to keep track of candies.
  static final int SIZE = 1000;
  ArrayList<String> candies = new ArrayList<String>();// Initializing the array list to keep a track of candies

  PillowCase() {
    number = 0; // Setting the variable number to zero
  }

  int getNumber() {
    return number;
  }// The accesor method to get the number of candies.

  String getCandy() {
    System.out.print("Trick or Treat!");
    Random r = new Random();// Random number generator
    int randomNum = r.nextInt(101);// Giving a top bound for random number
    if (randomNum < 11) {
      candy = "M&Ms";
    } else if (randomNum < 31) {// if functions to identify the candies
      candy = "Pink Starburst";
    } else if (randomNum < 46) {
      candy = "Hershey's Bar";
    } else if (randomNum < 56) {
      candy = "Milky Way";
    } else if (randomNum < 71) {
      candy = "Twix";
    } else if (randomNum < 96) {
      candy = "Reese's";
    } else {
      candy = "Kit Kat";
    }
    candies.add(candy);// adding the object to the array list
    number += 1; // adding the count to the variable
    System.out.print(" We got a " + candy + "!");
    System.out.println();
    return candy;
  }

  // arrays below for indexing while counting the total number of candies
  int counter[] = { 0, 0, 0, 0, 0, 0, 0 };
  String candyList[] = { "M&Ms", "Pink Starburst", "Hershey's Bar", "Milky Way", "Twix", "Reese's", "Kit Kat" };
//this calculates the total number candies received and prints a summary
  void printNumCandie() {
    for (int i = 0; i < candies.size(); i++) {
      if (candies.get(i).equals("M&Ms")) {
        counter[0] += 1;
      } else if (candies.get(i).equals("Pink Starburst")) {
        counter[0] += 1;
      } else if (candies.get(i).equals("Hershey's Bar")) {
        counter[0] += 1;
      } else if (candies.get(i).equals("Milky Way")) {
        counter[0] += 1;
      } else if (candies.get(i).equals("Twix")) {
        counter[0] += 1;
      } else if (candies.get(i).equals("Reese's")) {
        counter[5] += 1;
      } else {
        counter[6] += 1;
      }
    }
    int sum = 0;
    for (int value : counter) {
      sum += value;
    }
    double mySum = sum;
    double mySize = SIZE;
    double percent = (mySum / mySize) * 100;
    System.out.println("We got " + sum + " candies. " + percent + "% of our pillowcase.");
    System.out.println("We got...");
    for (int z = 0; z < counter.length; z++) {
      if (counter[z] > 0) {
        System.out.println(counter[z] + " " + candyList[z]);
      }
    }
  }
}