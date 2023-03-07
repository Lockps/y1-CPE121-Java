import java.util.*;

public class ex605 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] a = new double[5];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter number : ");
            a[i] = sc.nextDouble();
        }
        sc.close();
        int p = 10;
        for (int i = 0; i < a.length; i++) {
            int ran = (int) (Math.random() * 5);
            if (ran != p) {
                double samp = a[ran];
                a[ran] = a[i];
                a[i] = samp;
                p = ran;
            } else
                i--;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.printf("%.1f\n", a[i]);
        }
    }
}
