import java.util.Scanner;

public class qb72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String txt = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < txt.length(); i++) {
            Character chasamp = txt.charAt(i);
            if (chasamp >= '0' && chasamp <= '9') {
                int num = chasamp - '0';
                sum += num;
            }
        }
        System.out.println(sum);

        sc.close();
    }
}
