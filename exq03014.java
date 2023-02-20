import java.util.*;

public class exq03014 {
    public static void main(String[] args) {
        double out = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of m : ");
        int m = sc.nextInt();
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        for (int i = m; i <= n; i++) {
            int s = 2 * i - 1;
            out += s / (s + 2) + Math.pow(i, 2);
        }
        System.out.printf("The result of summation is %.1f", out);
        sc.close();
    }
}
