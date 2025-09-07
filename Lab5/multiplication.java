import java.util.Scanner;

public class multiplication {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    System.out.println("==== For Loop ====");
    for (int i = 1; i <= 10; i++) {
      System.out.printf("%d * %d = %d\n", num, i, num * i);
    }

    System.out.println("==== Do While Loop ====");
    int idx = 1;
    do {
      System.out.printf("%d * %d = %d\n", num, idx, num * idx);
      idx++;
    } while (idx <= 10);

    System.out.println("==== While Loop ====");
    int idx_ = 1;
    while (idx_ <= 10) {
      System.out.printf("%d * %d = %d\n", num, idx_, num * idx_);
      idx_++;
    }

    System.out.println("==== For each Loop ====");
    int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    for (int number : nums) {
      System.out.printf("%d * %d = %d\n", num, number, number * num);
    }

    sc.close();
  }
}
