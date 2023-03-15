import java.util.Scanner;

public class q61 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of row and column : ");
    public final int size;
    size = sc.nextInt();
    int[][] op = new int[size][size];
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        op[i][j] = (int) (Math.random() * 100);
        System.out.printf("%d\t", op[i][j]);
      }
      System.out.println();
    }
    show57star(op);
  }

  public static void show57star(int[][] matrix) {
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (matrix[i][j] % 10 == 5 || a[i][j] % 10 == 7)
          matrix[i][j] = -1;
      }
    }
  }
}