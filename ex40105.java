import java.util.Scanner;

public class ex40105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int out = reverse(input);
        System.out.println(out);
        sc.close();
    }

    public static int reverse(int input) {
        int out = 0;
        int s = 0, para = input;
        while (para != 0) {
            para /= 10;
            s++;
        }
        for (int i = s - 1; i >= 0; i--) {
            out += (input % 10) * Math.pow(10, i);
            input /= 10;
        }

        return out;
    }
}mkj,