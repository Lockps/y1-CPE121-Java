import java.util.Scanner;

public class exq40302 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.print("Select 1 to sphere\n");
            System.out.print("Select 2 to circular cone\n");
            System.out.print("Select 3 to rectangle box\n");
            System.out.print("Select 4 to exit\n");
            System.out.print("Select your choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the value of the height: ");
                    int h = sc.nextInt();
                    System.out.print("Enter the value of the lenght : ");
                    int l = sc.nextInt();
                    System.out.print("Enter the value of the widght : ");
                    int w = sc.nextInt();

                    double out = calSurface(h, l, w);

                    System.out.println(out);
                    break;
                case 2:
                    System.out.print("Enter the value of the radius : ");
                    int r = sc.nextInt();

                    double o = calSurface(r);
                    System.out.println(o);
                    break;
                case 3:
                    System.out.print("Enter the value of the height: ");
                    int height = sc.nextInt();
                    System.out.print("Enter the value of the radius : ");
                    int rad = sc.nextInt();

                    double op = calSurface(height, rad);
                    System.out.println(op);
                    break;
            }
        }
        sc.close();
    }

    public static double calSurface(double h, double l, double w) {
        return ((2 * l * w) + (2 * w * h) + (2 * h * l));
    }

    public static double calSurface(int r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public static double calSurface(int h , int r) {
        return Math.pow((Math.pow(r, 2))*(Math.pow(h, 2)),0.5)}

}
