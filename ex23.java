import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 11 == 0) {
            System.out.println(num + " is divisible by both 3 and 11.");
        }
        if (num % 3 != 0 && num % 11 == 0) {
            System.out.println(num + " divide by 11 ");
        }
        if (num % 3 == 0 && num % 11 != 0) {
            System.out.println(num + " divide by 3 ");
        }
        if (num % 3 != 0 && num % 11 != 0) {
            System.out.println(num + " is not divisible by both 3 and 11.");
        }
    }
}
