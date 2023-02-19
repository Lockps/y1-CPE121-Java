import javax.swing.JOptionPane;

public class ex17 {
    public static void main(String[] args) {
        JOptionPane box = new JOptionPane(System.in);
        double p = Float.parseFloat(box.showInputDialog(box, "Enter number is pound "));
        box.showMessageDialog(box, "it's " + p * 0.454 + " kilograms");
    }
}
