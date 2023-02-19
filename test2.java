import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        int a = inp % 10;
        int b = (inp / 10) % 10;
        int c = (inp / 100) % 10;
        int d = (inp / 1000) % 10;
        int x = calc(a);
        int y = calc(b);
        int z = calc(c);
        int p = calc(d);

        System.out.print(String.format("%04d", p));
        System.out.print(String.format("% 05d", z));
        System.out.print(String.format("% 05d", y));
        System.out.print(String.format("% 05d", x));
    }

    public static int calc(int r) {
        int a = 0;
        double i = 0;
        while (r != 0) {
            a += (r % 2) * Math.pow(10, i);
            i++;
            r /= 2;
        }
        return a;
    }
}