import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Event Handling Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JLabel label = new JLabel("Interact with the window!", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 16));
        frame.add(label, BorderLayout.CENTER);

        // Mouse motion listener
        frame.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                label.setText("Mouse moved to: (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        // Key press listener
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                label.setText("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
            }
        });

        frame.setFocusable(true);       // Needed for key events
        frame.requestFocusInWindow();   // Set focus to capture key input

        frame.setVisible(true);
    }
}
