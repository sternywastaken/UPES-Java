import java.util.Scanner;

public class Arithmetic {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    int x = sc.nextInt();
    System.out.print("Enter the second number: ");
    int y = sc.nextInt();

    System.out.printf("x + y = %d\n", x + y);
    System.out.printf("x - y = %d\n", x - y);
    System.out.printf("x / y = %d\n", x / y);
    System.out.printf("x %% y = %d\n", x % y);

    sc.close();
  }
}
