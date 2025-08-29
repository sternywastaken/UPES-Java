import java.util.Scanner;

public class Season {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a month number: ");
    int num = sc.nextInt();

    switch (num) {
    case 1, 2, 12:
      System.out.println("Winter.");
      break;
    case 3, 4, 5:
      System.out.println("Spring.");
      break;
    case 6, 7, 8:
      System.out.println("Summer.");
      break;
    case 9, 10, 11:
      System.out.println("Autumn.");
      break;
    default:
      System.out.println("Not a month number!");
    }

    sc.close();
  }
}
