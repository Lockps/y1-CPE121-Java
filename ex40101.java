import java.util.Scanner;

public class ex40101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 number :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean out = check(a, b, c);

        System.out.println(out);
        sc.close();
    }

    public static boolean check(int a, int b, int c) {
        boolean out, x = true, y = false;
        if ((a > b && a > c) && (c < b && c < a))
            out = y;
        else if ((a > b && a > c) || (c < b && c < a))
            out = x;
        else
            out = y;
        return out;
    }
}