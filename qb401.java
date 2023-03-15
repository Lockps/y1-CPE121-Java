import java.util.Scanner;

public class qb401 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double d = sc.nextInt();

        double op = diff(a, b, c, d);
        System.out.println(op);

        sc.close();

    }

    public static double diff(double a, double b, double c, double d) {
        return (float) (1.0 / 3.0 * Math.PI) * ((Math.pow(b, 2) * d) - (Math.pow(a, 2) * c));
    }
}
