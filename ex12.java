import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int product = 1;

        while (num != 0) {
            int a = num % 10;
            product *= a;
            num /= 10;
        }
        System.out.println("Product of digits: " + product);
        sc.close();

    }
}
