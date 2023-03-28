import java.util.Scanner;

public class qb71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String txt = sc.nextLine();
        System.out.print("Enter the character : ");
        Character cha = sc.next().charAt(0);

        int op = count(txt, cha);

        System.out.println(op);

        sc.close();
    }

    public static int count(String txt, Character cha) {
        int sum = 0;
        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i) == cha)
                sum++;
        }

        return sum;
    }
}
