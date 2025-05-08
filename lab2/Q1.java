import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q1 implements KeyListener, MouseMotionListener {
    JLabel label;

    public Q1() {
        JFrame frame = new JFrame("Event Handling (No Adapter)");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        label = new JLabel("Move mouse or press a key", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 16));
        frame.add(label, BorderLayout.CENTER);

        // Add listeners
        frame.addKeyListener(this);
        frame.addMouseMotionListener(this);

        frame.setFocusable(true);        // Needed to receive key events
        frame.requestFocusInWindow();    // Make sure the window has focus

        frame.setVisible(true);
    }

    // KeyListener methods
    @Override
    public void keyPressed(KeyEvent e) {
        label.setText("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Optional
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Optional
    }

    // MouseMotionListener methods
    @Override
    public void mouseMoved(MouseEvent e) {
        label.setText("Mouse moved to: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // Optional
    }

    public static void main(String[] args) {
        new Q1();
    }
}
