// write a program to print hello world
// addition function

public class Hello {
  public static void main(String[] args) {
    // Hello
    System.out.println("Hello world");
    int result = addition(5, 10);
    System.out.println(result);
  }

  public static int addition(int a, int b) {
    int result = a + b;
    return result;
  }
}
