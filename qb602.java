import java.util.Scanner;

public class qb602 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inp = new int[10];
        System.out.print("Enter your number : ");
        for (int i = 0; i < inp.length; i++) {
            inp[i] = sc.nextInt();
        }
        double avr = average(inp);
        int less = 0;

        for (int i = 0; i < inp.length; i++) {
            if (inp[i] < avr) {
                less++;
            }
        }
        System.out.println("average is " + avr);
        System.out.println("number less than average is " + less);

    }

    public static double average(int[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        sum /= a.length;
        return sum;
    }
}
