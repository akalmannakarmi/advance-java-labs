import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q1 {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Swing Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create a label
        JLabel label = new JLabel("Hello, Swing!");
        label.setBounds(100, 50, 150, 20);
        frame.add(label);

        // Create a button
        JButton button = new JButton("Click Me");
        button.setBounds(100, 100, 100, 30);
        frame.add(button);

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked!");
            }
        });

        // Set frame visibility
        frame.setVisible(true);
    }
}
