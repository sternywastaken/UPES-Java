import java.util.Scanner;

public class Discount {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter price: ");
    int price = sc.nextInt();

    if (price > 1000) {
      System.out.println("20% discount.");
    } else if (price > 500) {
      System.out.println("10% discount.");
    } else {
      System.out.println("5% discount.");
    }

    sc.close();
  }
}
