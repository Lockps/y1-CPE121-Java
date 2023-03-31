import java.util.Scanner;

public class mid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int a = (int) (Math.random() * 2000 - 1000);
                System.out.printf("%d\t", a);
                if (a > 0 && (a % 7 == 0 || a % 3 == 0)) {
                    sum += a;
                }

            }
            System.out.println();
        }
        System.out.println(sum);
        sc.close();
    }
}
