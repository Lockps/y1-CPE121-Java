public class primenumber {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                sum++;
            if (sum == 1) {
                System.out.println(num);
            }
            sum = 0;
            num++;
        }
    }
}