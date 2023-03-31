import java.util.Scanner;

public class ex701 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        boolean op = check(txt);
        System.out.println(op);
        sc.close();
    }

    public static boolean check(String txt) {
        if (txt.charAt(1) == 'e') {
            return true;
        } else {
            return false;
        }
    }
}
