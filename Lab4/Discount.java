import java.util.Scanner;

public class Discount {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter price: ");
    int price = sc.nextInt();
    double discounted_price;

    if (price > 1000) {
      System.out.println("20% discount.");
      discounted_price = price - (0.20 * price);
      System.out.println("Discounted Price: " + discounted_price);
    } else if (price > 500) {
      System.out.println("10% discount.");
      discounted_price = price - (0.10 * price);
      System.out.println("Discounted Price: " + discounted_price);
    } else {
      System.out.println("5% discount.");
      discounted_price = price - (0.50 * price);
      System.out.println("Discounted Price: " + discounted_price);
    }

    sc.close();
  }
}
