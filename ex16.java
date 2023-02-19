import javax.swing.JOptionPane;

public class ex16 {
    public static void main(String[] args) {
        JOptionPane box = new JOptionPane(System.in);
        double r = Float.parseFloat(box.showInputDialog(box, "input Radius : "));
        double l = Float.parseFloat(box.showInputDialog(box, "input Lenght: "));
        double v = r * r * Math.PI;
        box.showMessageDialog(box, "area is " + v);
        box.showMessageDialog(box, "volume is " + v * l);
    }
}
