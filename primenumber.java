public class primenumber {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            if (num % i == 0)
                sum++;
            if (sum == 2) {
                System.out.println(num);
            }
            sum = 0;
            num++;
        }
    }
}