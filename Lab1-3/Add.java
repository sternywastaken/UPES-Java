// write a program to add two numbers

import java.util.Scanner;

class Add {
  void display() { System.out.println("Welcome to Java."); }

  int add() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int x = sc.nextInt();
    System.out.println("Enter another number: ");
    int y = sc.nextInt();
    int result = x + y;
    sc.close();
    return result;
  }

  public static void main(String[] args) {
    Add adder = new Add();
    adder.display();
    int result = adder.add();
    System.out.println("The sum is: " + result);
  }
}
