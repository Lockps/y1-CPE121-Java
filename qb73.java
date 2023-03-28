import java.util.Scanner;

public class qb73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String txt = sc.nextLine();

        int sum = 0, count = 0;
        for (int i = 0; i < txt.length(); i++) {
            Character samp = txt.charAt(i);
            if (samp >= '0' && samp <= '9') {
                int numsamp = samp - '0';
                if (numsamp % 2 == 0) {
                    count++;
                } else {
                    count++;
                    sum += numsamp;
                }
            }
        }
        System.out.println(sum);
        System.out.println(count);

        sc.close();
    }
}
