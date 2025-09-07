import java.util.Scanner;

public class Fib {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    System.out.println("\n==== For Loop ====");
    int first = 0;
    int second = 1;
    for (int i = 0; i <= num; i++) {
      System.out.printf("%d ", first);
      int next = first + second;
      first = second;
      second = next;
    }

    System.out.println("\n==== While Loop ====");
    first = 0;
    second = 1;
    int idx = 0;
    while (idx <= num) {
      System.out.printf("%d ", first);
      int next = first + second;
      first = second;
      second = next;
      idx++;
    }

    System.out.println("\n==== Do While ====");
    first = 0;
    second = 1;
    idx = 0;
    do {
      System.out.printf("%d ", first);
      int next = first + second;
      first = second;
      second = next;
      idx++;
    } while (idx <= num);

    sc.close();
  }
}
