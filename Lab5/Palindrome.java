import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter something: ");
    String thing = sc.next();

    System.out.println("\n==== For Loop ====");
    String reversed_thing = "";
    for (int i = thing.length() - 1; i >= 0; i--) {
      reversed_thing += thing.charAt(i);
    }
    if (reversed_thing.equals(thing)) {
      System.out.println("Palindrome.");
    } else {
      System.out.println("Not a palindrome");
    }

    System.out.println("\n==== While Loop ====");
    reversed_thing = "";
    int idx = thing.length() - 1;

    while (idx >= 0) {
      reversed_thing += thing.charAt(idx);
      idx--;
    }
    if (reversed_thing.equals(thing)) {
      System.out.println("Palindrome.");
    } else {
      System.out.println("Not a palindrome.");
    }

    System.out.println("\n==== Do While Loop ====");
    reversed_thing = "";
    idx = thing.length() - 1;
    do {
      reversed_thing += thing.charAt(idx);
      idx--;
    } while (idx >= 0);
    if (reversed_thing.equals(thing)) {
      System.out.println("Palindrome.");
    } else {
      System.out.println("Not a palindrome.");
    }

    System.out.println("\n==== For Each =====");
    char[] arr = new char[thing.length()];
    for (int j = thing.length() - 1; j >= 0; j--) {
      arr[thing.length() - 1 - j] = thing.charAt(j);
    }
    reversed_thing = "";
    for (char letter : arr) {
      reversed_thing += letter;
    }
    if (reversed_thing.equals(thing)) {
      System.out.println("Palindrome.");
    } else {
      System.out.println("Not a palindrome.");
    }
    sc.close();
  }
}
