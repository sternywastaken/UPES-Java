import java.util.Scanner;

public class MaxMin {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();

    int arr[] = new int[size];

    for (int i = 0; i < size; i++) {
      System.out.print("Enter an element: ");
      int num = sc.nextInt();
      arr[i] = num;
    }

    for (int num : arr) {
      System.out.printf("%d ", num);
    }

    System.out.println("\n==== For Loop ====");

    sc.close();
  }
}
