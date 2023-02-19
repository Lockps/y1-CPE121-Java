import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int n = sc.nextInt();
        int odd = 0, neg = 0, s = 0, both = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                int a = (int) (Math.random() * 3000 - 1750);
                if (a % 2 == 1)
                    odd++;
                if (a < 0)
                    neg++;
                if (a % 2 == 1 && a < 0)
                    both++;
                s += a;
                System.out.printf("%d\t", a);
            }
            System.out.println();
        }
        System.out.println("Total of negative number is " + neg);
        System.out.println("Total of odd number is " + odd);
        System.out.println("Total of our number is " + both);
        System.out.println("Total is " + s);

    }
}
