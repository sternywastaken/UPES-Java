import java.util.Scanner;

public class Relational {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a: ");
    int a = sc.nextInt();
    System.out.print("Enter b: ");
    int b = sc.nextInt();

    System.out.printf("a = %d\n", a);
    System.out.printf("b = %d\n", b);
    System.out.printf("a == b = %b\n", a == b);
    System.out.printf("a > b = %b\n", a > b);
    System.out.printf("a < b = %b\n", a < b);
    System.out.printf("a >= b = %b\n", a >= b);
    System.out.printf("a <= b = %b\n", a <= b);
    sc.close();
  }
}
