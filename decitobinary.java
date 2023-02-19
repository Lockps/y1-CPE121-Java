import java.util.Scanner;

public class decitobinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long deci = sc.nextLong();
        long binary = calc(deci);
        System.out.println(binary);
    }

    public static long calc(long y) {
        long a = 0;
        int i = 0;
        while (y != 0) {
            a += (y % 2) * Math.pow(10, i);
            i++;
            y /= 2;
        }
        return a;
    }
}