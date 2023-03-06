import java.util.*;

public class ex602 {
    public static int calc() {
        Scanner sc = new Scanner(System.in);
        System.out.print("size array : ");
        int size = sc.nextInt();

        int[] num = new int[size];
        int[] score = new int[4];
        System.out.print("first number : ");
        int a = sc.nextInt();
        System.out.print("second number : ");
        int b = sc.nextInt();
        System.out.print("third number : ");
        int c = sc.nextInt();
        System.out.print("forth number : ");
        int d = sc.nextInt();

        for (int i = 0; i < size; i++) {
            num[i] = (int) (Math.random() * 10);
            System.out.printf("{%d} ", num[i]);
            if (num[i] == a)
                score[0]++;
            if (num[i] == b)
                score[1]++;
            if (num[i] == c)
                score[2]++;
            if (num[i] == d)
                score[3]++;
        }
        int samp = Integer.MIN_VALUE;
        for (int i = 0; i < score.length; i++) {
            if (samp < score[i])
                samp = score[i];
        }
        sc.close();
        System.out.println("\nMaxfrequency : " + samp);
        return samp;
    }

    public static void main(String[] args) {
        calc();
    }
}