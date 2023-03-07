import java.util.Scanner;

public class ex603 {
    public static int calc(double[] a) {
        double samp = Integer.MAX_VALUE;
        int x = 0;
        for (int i = 0; i < a.length; i++) {
            if (samp > a[i]) {
                samp = a[i];
                x = i;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] input = new double[10];
        for (int i = 0; i < input.length; i++)
            input[i] = sc.nextDouble();
        int op = calc(input);
        System.out.println(op);
        sc.close();
    }
}
