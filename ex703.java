import java.util.Scanner;

class ex703 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.next();
        int length = txt.length();

        sc.close();

        if (length >= 3) {
            String samp = txt.substring(length - 3, length);
            StringBuilder op = new StringBuilder(txt);

            op.delete(length - 3, length);

            System.out.println(op + samp.toUpperCase());
        } else
            System.out.println(txt.toUpperCase());

    }
}