import java.util.Scanner;

public class ex702 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        String samp = txt.substring(0, 2);
        System.out.println(txt.substring(2) + samp);
        sc.close();
    }
}
