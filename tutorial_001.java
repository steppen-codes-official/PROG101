// tutorial_001
// Denomination

import java.util.Scanner;

public class tutorial_001 {
  public static void main(String[] args) {
    // Denomination
    
    Scanner scan = new Scanner(System.in);
    int amount,
        fifty,
        twenty,
        ten,
        five,
        one,
        tracker;
    
    // input
    System.out.print("Amount: ");
    amount = scan.nextInt();
    
    // process
    tracker = amount;
    
    fifty = tracker / 50;
    tracker = tracker % 50;
    
    twenty = tracker / 20;
    tracker = tracker % 20;
    
    ten = tracker / 10;
    tracker = tracker % 10;
    
    five = tracker / 5;
    tracker = tracker % 5;
    
    one = tracker / 1;
    tracker = tracker % 1;
    
    // output
    System.out.println("50: " + fifty);
    System.out.println("20: " + twenty);
    System.out.println("10: " + ten);
    System.out.println("5: " + five);
    System.out.println("1: " + one);
  }
 
}
