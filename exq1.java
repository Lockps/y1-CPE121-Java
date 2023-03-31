import java.util.Scanner;
import javax.swing.JOptionPane;

public class exq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JOptionPane box = new JOptionPane();
        System.out.print("Enter the amount of water in kilogram : ");
        float wei = sc.nextFloat();
        System.out.print("Enter the initial Temperature and the Final temperature : ");
        String T = sc.next();
        String a = sc.next();
        float t1 = Float.parseFloat(T);
        float t2 = Float.parseFloat(a);
        float r = wei * 4184 * (t2 - t1);
        box.showMessageDialog(box, "The energy needed is " + r);
        sc.close();
    }
}
