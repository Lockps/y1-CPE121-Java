public class lquiz0301 {
    public static void main(String[] args) {
        int x = 0;
        for (int j = 0; j < 7; j++) {
            int num = 5;
            for (int i = 0; i <= x; i++) {
                int out = num + i;
                System.out.printf("%d ", out);
            }
            x++;
            System.out.printf("\n");
        }

    }
}
