import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        System.out.print("Input time in seconds : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int hour = x / 3600;
        int minute = (x % 3600) / 60;
        int sec = (x % 3600) % 60;

        System.out.println(hour + " : " + minute + " : " + sec);
    }
}
