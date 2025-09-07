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
    int max = 0;
    int min = arr[0];
    for (int i = 0; i < size; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    System.out.printf("Max: %d\n", max);
    System.out.printf("Min: %d\n", min);

    System.out.println("\n==== While Loop ====");
    max = 0;
    min = arr[0];
    int idx = 0;
    while (idx < size) {
      if (arr[idx] > max) {
        max = arr[idx];
      }
      if (arr[idx] < min) {
        min = arr[idx];
      }
      idx++;
    }
    System.out.printf("Max: %d\n", max);
    System.out.printf("Min: %d\n", min);

    System.out.println("\n==== Do While ====");
    max = 0;
    min = arr[0];
    idx = 0;
    do {
      if (arr[idx] > max) {
        max = arr[idx];
      }
      if (arr[idx] < min) {
        min = arr[idx];
      }
      idx++;
    } while (idx < size);
    System.out.printf("Max: %d\n", max);
    System.out.printf("Min: %d\n", min);

    System.out.println("\n==== For Each ====");
    max = 0;
    min = arr[0];
    for (int num : arr) {
      if (num > max) {
        max = num;
      }
      if (num < min) {
        min = num;
      }
    }
    System.out.printf("Max: %d\n", max);
    System.out.printf("Min: %d\n", min);

    sc.close();
  }
}
