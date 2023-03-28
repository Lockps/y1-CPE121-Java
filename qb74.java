import java.util.Scanner;

public class qb74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String txt = sc.nextLine();

        int sum = 0;
        for (int i = 0; i < txt.length(); i++) {
            Character samp = txt.charAt(i);
            if (samp == 'a' || samp == 'e' || samp == 'i' || samp == 'o' || samp == 'u' || samp == 'A' || samp == 'E'
                    || samp == 'I' || samp == 'O' || samp == 'U') {
                sum++;
            }
        }

        System.out.println(sum);
        sc.close();
    }
}
