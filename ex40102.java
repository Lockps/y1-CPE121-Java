public class ex40102 {
    public static void main(String[] args) {
        System.out.println(" i\t\t\t\t\tm(i)");
        for (int i = 1; i <= 900; i += 100) {
            double m = m(i);
            System.out.printf(" %d\t\t\t\t\t%.3f\n", i, m);
        }
    }

    public static double m(int i) {
        double m = 0;
        for (int j = 1; j <= i; j++) {
            double under = (2 * j - 1);
            m += Math.pow((-1), j + 1) / under;
        }
        return 4 * m;
    }
}