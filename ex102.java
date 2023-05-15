import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;;

public class ex102 extends JFrame{
    private Keyboardpanel keyboardpanel = new Keyboardpanel();  
    ex102(){
        add(keyboardpanel);

        keyboardpanel.setFocusable(true);
    }  
    public static void main(String[] args) {
        ex102 frame = new ex102();
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(3);

    }

    class Keyboardpanel extends JPanel{
        int x,y =30;

        Keyboardpanel(){
            addKeyListener(new KeyAdapter(){
                @Override
                public void keyPressed(KeyEvent e) {
                    switch(e.getKeyCode()){
                         case KeyEvent.VK_DOWN: y += 10; break;
                        case KeyEvent.VK_UP: y -= 10; break;
                        case KeyEvent.VK_LEFT: x -= 10; break;
                        case KeyEvent.VK_RIGHT: x += 10; break;
                    }
                    repaint();
                }
            });
        }
        
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawOval(x, y, 30, 30);
        }
    }
}
