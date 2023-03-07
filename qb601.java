import java.util.Scanner;

public class qb601 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int input = sc.nextInt();
        int sum = 0;
        int[][] x = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                x[i][j] = (int) (Math.random() * 6 + 1);
                System.out.printf("%d\t", x[i][j]);
                if (x[i][j] == input) {
                    sum++;
                }
            }
            System.out.println();
            System.out.println();
        }
        System.out.println("number frequency is " + sum);
    }
}
