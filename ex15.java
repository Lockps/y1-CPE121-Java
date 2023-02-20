import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        System.out.print("Enter degree in Fahrenheit : ");
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        float z = x - 32;
        float y = z * (5) / (9);

        System.out.println(x + " in fahrenhiet is " + y + " celsius");
        sc.close();
    }
}
