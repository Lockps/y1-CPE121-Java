import java.util.Scanner;

public class ex601 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        int score = 0;
        for (int i = 0; i < size; i++) {
            a[i] = (int) (Math.random() * 99);
            if (a[i] % 10 == 4 || a[i] % 10 == 9) {
                score++;
                if (a[i] % 7 == 0)
                    score++;
            }
        }

        System.out.print("{");
        for (int j = 0; j < size; j++)
            System.out.printf("%d ", a[j]);
        System.out.println("\b}");
        System.out.println("score is " + score);
        sc.close();
    }
}
