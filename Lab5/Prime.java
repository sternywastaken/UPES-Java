import java.util.Scanner;

public class Prime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    System.out.println("\n==== For Loop ====");
    boolean flag = true;
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        flag = false;
        break;
      } else if (num % i != 0) {
        flag = true;
      }
    }
    System.out.printf("Prime: %b\n", flag);

    System.out.println("\n==== While Loop ====");
    int idx = 2;
    flag = true;
    while (idx < num) {
      if (num % idx == 0) {
        flag = false;
        break;
      } else if (num % idx != 0) {
        flag = true;
      }
      idx++;
    }
    System.out.printf("Prime: %b\n", flag);

    System.out.println("\n==== Do While ====");
    idx = 2;
    flag = true;
    do {
      if (num % idx == 0) {
        flag = false;
        break;
      } else if (num % idx != 0) {
        flag = true;
      }
      idx++;
    } while (idx < num);

    System.out.printf("Prime: %b\n", flag);

    /*
     * Using a for each loop would require to fill an array up till the given
     * number and divide the given number with each member of the array. It
     * works but highly unoptimal
     */
    sc.close();
  }
}
