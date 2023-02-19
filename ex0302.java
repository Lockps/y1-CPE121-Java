public class ex0302 {
    public static void main(String[] args) {
        int x = 5;
        for (int i = 0; i <= 5; i++) {
            int s = 10;
            for (int j = x; j >= 0; j--) {
                System.out.printf("%d\t", s);
                s++;
            }
            x--;
            System.out.println();
        }
    }
}
