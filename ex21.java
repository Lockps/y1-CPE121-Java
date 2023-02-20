import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a b c d e f :");

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();
        double x = a * d - b * c;
        if (x == 0) {
            System.out.println("no solution");

        } else {
            System.out.print("x is " + (e * d - b * f) / x + " y is " + (a * f - e * c) / x);
        }
        sc.close();
    }
}
