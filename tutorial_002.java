// tutorial_002
// operate numbers

import java.util.Scanner;

public class tutorial_002 {
  public static void main(String[] args) {
    
	// Scanner & variables
    Scanner scan = new Scanner(System.in);
    int a, b, c;
    
    // input
    System.out.print("First num: ");
    a = scan.nextInt();
    System.out.print("Second num: ");
    b = scan.nextInt();
    System.out.print("Third num: ");
    c = scan.nextInt();
    
    // output
    System.out.println("Result: " + (a % b * c) );
    
  }
 
}