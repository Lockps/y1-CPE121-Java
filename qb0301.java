import java.util.Scanner;

public class qb0301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N :");
        int v = sc.nextInt();
        double o = 0;
        int x = 0;
        for (int i = 0; i <= v; i++) {
            o += (float) i / (i + 2);
            x++;
            if (x == 50) {
                System.out.printf("%.3f\n", o);
                x = 0;
            }
        }
        System.out.println("Last value is " + o);
        sc.close();
    }
}
