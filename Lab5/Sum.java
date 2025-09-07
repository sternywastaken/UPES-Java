import java.util.Scanner;

public class Sum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    int temp = num;

    System.out.println("\n==== For Loop ====");
    int sum = 0;
    for (; num != 0; num /= 10) {
      int digit = num % 10;
      sum += digit;
    }
    System.out.printf("Sum: %d\n", sum);

    System.out.println("\n==== While Loop ====");
    sum = 0;
    num = temp;
    while (num != 0) {
      int digit = num % 10;
      sum += digit;
      num /= 10;
    }
    System.out.printf("Sum: %d\n", sum);

    System.out.println("\n==== Do While ====");
    sum = 0;
    num = temp;
    do {
      int digit = num % 10;
      sum += digit;
      num /= 10;
    } while (num != 0);
    System.out.printf("Sum: %d\n", sum);

    sc.close();
  }
}
