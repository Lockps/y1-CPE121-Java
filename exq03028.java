public class exq03028 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            int c = 0;
            int a = (int) (Math.random() * 90000 + 10000);
            int b = a % 10;
            if (b == 3)
                sum++;
            for (int j = 0; j <= 5; j++) {
                int r = b %= 10;
                if (r == 3)
                    c++;
            }
            if (b != 3 && c >= 2)
                sum++;
            System.out.printf("%d ", a);
        }
        System.out.printf("\n\ncount is %d\n", sum);

    }
}
