import java.util.Scanner;

public class Reverse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    int reversed_num = 0;

    System.out.println("\n==== For Loop ====");
    for (; num != 0; num /= 10) {
      int digit = num % 10;
      reversed_num = reversed_num * 10 + digit;
    }
    System.out.printf("Reversed: %d\n", reversed_num);

    System.out.println("\n==== While Loop ====");

    int num2 = sc.nextInt();
    int reversed_while = 0;
    while (num2 != 0) {
      int digit_ = num2 % 10;
      reversed_while = reversed_while * 10 + digit_;
      num2 /= 10;
    }
    System.out.printf("Reversed: %d\n", reversed_while);

    System.out.println("\n==== Do While ====");
    int num3 = sc.nextInt();
    int reversed_do = 0;
    do {
      int digit3 = num3 % 10;
      reversed_do = reversed_do * 10 + digit3;
      num3 /= 10;
    } while (num3 != 0);
    System.out.printf("Reversed: %d\n", reversed_do);

    sc.close();
  }
}
