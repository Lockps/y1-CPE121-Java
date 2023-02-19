import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        System.out.print("input your weight in kg : ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextInt();
        System.out.print("input your Height in cm : ");
        double y = sc.nextInt();
        double z = (y / 100) * (y / 100);
        double BMI = x / z;

        System.out.println("BMI is " + BMI);
    }
}
