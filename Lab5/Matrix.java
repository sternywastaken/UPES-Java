public class Matrix {
  public static void main(String[] args) {
    int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

    System.out.println("\n==== For Loop ====");
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.printf("%d \t", arr[i][j]);
      }
      System.out.println();
    }

    System.out.println("\n==== While Loop ====");
    int idx = 0;
    while (idx < arr.length) {
      int idx_ = 0;
      while (idx_ < arr[idx].length) {
        System.out.printf("%d \t", arr[idx][idx_]);
        idx_++;
      }
      System.out.println();
      idx++;
    }

    System.out.println("\n==== Do While ====");
    idx = 0;
    do {
      int idx_ = 0;
      do {
        System.out.printf("%d \t", arr[idx][idx_]);
        idx_++;
      } while (idx_ < arr[idx].length);

      System.out.println();
      idx++;
    } while (idx < arr.length);

    System.out.println("\n==== For Each ====");
    for (int[] row : arr) {
      for (int num : row) {
        System.out.printf("%d \t", num);
      }
      System.out.println();
    }
  }
}
