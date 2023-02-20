import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year");
        int a = sc.nextInt();
        switch (a % 12) {
            case 0:
                System.out.println("monkey");
        }
        switch (a % 12) {
            case 1:
                System.out.println("rooster");
        }
        switch (a % 12) {
            case 2:
                System.out.println("dog");
        }
        switch (a % 12) {
            case 3:
                System.out.println("pig");
        }
        switch (a % 12) {
            case 4:
                System.out.println("rat");
        }
        switch (a % 12) {
            case 5:
                System.out.println("ox");
        }
        switch (a % 12) {
            case 6:
                System.out.println("tiger");
        }
        switch (a % 12) {
            case 7:
                System.out.println("rabbit");
        }
        switch (a % 12) {
            case 8:
                System.out.println("dragon");
        }
        switch (a % 12) {
            case 9:
                System.out.println("snake");
        }
        switch (a % 12) {
            case 10:
                System.out.println("horse");
        }
        switch (a % 12) {
            case 11:
                System.out.println("sheep");
        }

        sc.close();
    }
}
