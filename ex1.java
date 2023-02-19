import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Please enter a decimal value(0000-7777)");
        int x = sn.nextInt();
        int b11 = x / 2 % 10;
        int z = x / 20 % 10;
        int a = x / 200 % 10;
        System.out.print("Binary value in each digit" + x * y * z * a);
    }
}
