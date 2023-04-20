import java.util.Scanner;

public class phibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int enter = 0;
        while (enter != 222) {
            System.out.print("Select your enter (if want to exit press 222): ");
            enter = sc.nextInt();

            if (enter != 222 && enter > 13)
                System.out.println("Input again max is 13!!\n");

            else if (enter != 222) {
                calc(enter);
            }
        }
        sc.close();
    }

    public static void calc(int enter) {
        int ta = 11;
        int x = 1;
        int num = 1;
        for (int i = 0; i < enter; i++) {
            for (int tab = ta; tab >= 0; tab--) {
                System.out.printf("\t");
            }
            for (int j = 1; j <= x; j++) {
                System.out.printf("%d\t", num);
                num++;
            }
            ta--;
            x += 2;
            System.out.println();
            // System.out.println();

        }
    }
}
