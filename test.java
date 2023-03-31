import java.util.Scanner;

class test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      System.out.print("Enter value of c : ");
      int c = sc.nextInt();
      System.out.print("Enter value of m : ");
      int m = sc.nextInt();
      System.out.print("Enter value of y : ");
      int y = sc.nextInt();

      double[] arr = new double[24];

      int samp = 20;

      for (int i = 0; i < y; i++) {
        arr[i] = ((samp - c)) / m;
        System.out.printf("%.1f  ", arr[i]);
        samp++;
      }

      sc.close();
    }

    catch (ArithmeticException math) {
      System.out.print(math);
    }

    catch (ArrayIndexOutOfBoundsException array) {
      System.out.print(array);
    }

    catch (Exception wrongtype) {
      System.out.print(wrongtype);

    }

  }
}