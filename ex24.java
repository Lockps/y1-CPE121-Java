import java.util.Scanner;
import java.util.Random;

public class ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int in = sc.nextInt();
        int a = ran.nextInt(6) + 1;
        if (in == a) {
            System.err.println("your guess is correct");
        } else {
            System.err.println("your guess is incorrect");
        }
    }
}
