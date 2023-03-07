public class ex604 {
    public static void main(String[] args) {
        int[] firnum = { 1, 2, 3, 4, 5, 6 };
        double[] senum = { 6.0, 4.4, 1.9, 2.9, 3.4, 3.5 };

        int avint = average(firnum);
        double avdou = average(senum);

        System.out.println(avint);
        System.out.println(avdou);
    }

    public static int average(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++)
            sum += a[i];
        sum /= a.length;
        return sum;
    }

    public static double average(double[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++)
            sum += a[i];
        sum /= a.length;
        return sum;
    }
}
