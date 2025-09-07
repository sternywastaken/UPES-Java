import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    System.out.println("\n==== For Loop ====");
    int fact_for = 1;
    for (int i = 1; i <= num; i++) {
      fact_for *= i;
    }
    System.out.printf("Factorial: %d\n", fact_for);

    System.out.println("\n==== While Loop ====");
    int fact_while = 1;
    int idx = 1;
    while (idx <= num) {
      fact_while *= idx;
      idx++;
    }
    System.out.printf("Factorial: %d\n", fact_while);

    System.out.println("\n==== Do While ====");
    int fact_do = 1;
    int idx_ = 1;
    do {
      fact_do *= idx_;
      idx_++;
    } while (idx_ <= num);
    System.out.printf("Factorial: %d\n", fact_do);

    System.out.println("\n==== For each ====");

    sc.close();
  }
}
