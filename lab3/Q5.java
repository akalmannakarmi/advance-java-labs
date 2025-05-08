import javax.swing.*;
import java.awt.*;

public class Q5 extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(50, 30, 100, 60);  // Draw red rectangle
        g.setColor(Color.BLUE);
        g.drawOval(50, 110, 100, 60); // Draw blue oval
        g.setColor(Color.BLACK);
        g.drawString("Hello Graphics!", 60, 200);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Graphics Example");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Q5());
        frame.setVisible(true);
    }
}
