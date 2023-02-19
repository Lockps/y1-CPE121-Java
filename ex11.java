import java.util.Scanner;

public class ex11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter inches as an integer : ");

        int inp = sc.nextInt();

        System.out.print("The value in centimeter is : " + inp / 0.3937);
    }
}
