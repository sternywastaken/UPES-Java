import java.util.Scanner;

public class Bitwise {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a: ");
    int a = sc.nextInt();
    System.out.print("Enter b: ");
    int b = sc.nextInt();

    System.out.printf("a & b = %d\n", a & b);
    System.out.printf("a ^ b = %d\n", a ^ b);
    System.out.printf("a >> b = %d\n", a >> b);
    System.out.printf("a << b = %d\n", a << b);
    System.out.printf("a >>> b = %d\n", a >>> b);
    System.out.printf("a | b = %d\n", a | b);
    System.out.printf("~a = %d\n", ~a);

    sc.close();
  }
}
