import java.util.Scanner;

public class Grade {
  public void gradeIf(int marks) {
    if (marks >= 90) {
      System.out.println("Grade A");
    } else if (marks >= 80) {
      System.out.println("Grade B");
    } else if (marks >= 70) {
      System.out.println("Grade C");
    } else {
      System.out.println("Fail");
    }
  }

  public void gradeSwitch(int marks) {
    switch (marks / 10) {
    case 10:
      System.out.println("Grade A");
      break;
    case 9:
      System.out.println("Grade A");
      break;
    case 8:
      System.out.println("Grade B");
      break;
    case 7:
      System.out.println("Grade C");
      break;
    default:
      System.out.println("Fail");
    }
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Grade g = new Grade();
    System.out.println("Enter your marks: ");
    int marks = sc.nextInt();

    g.gradeIf(marks);
    g.gradeSwitch(marks);

    sc.close();
  }
}
