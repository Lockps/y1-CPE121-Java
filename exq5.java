import javax.swing.JOptionPane;

public class exq5 {
    public static void main(String[] args) {
        float x = Float.parseFloat(JOptionPane.showInputDialog(null, "Enter the starting velocity(vo)"));
        float y = Float.parseFloat(JOptionPane.showInputDialog(null, "Enter the ending velocity (v1):"));
        float z = Float.parseFloat(JOptionPane.showInputDialog(null, "Enter the time span(t):"));
        double a = (y - x) / z;
        JOptionPane.showMessageDialog(null, "The average acceleration is " + a);
    }
}
