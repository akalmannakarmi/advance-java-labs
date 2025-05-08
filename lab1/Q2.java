import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2, 5, 5));

        // Input fields
        JTextField num1Field = new JTextField();
        JTextField num2Field = new JTextField();

        // Operator dropdown
        String[] operations = { "+", "-", "*", "/" };
        JComboBox<String> operatorBox = new JComboBox<>(operations);

        // Result field
        JTextField resultField = new JTextField();
        resultField.setEditable(false);

        // Button
        JButton calculateButton = new JButton("Calculate");

        // Add components to frame
        frame.add(new JLabel("Number 1:"));
        frame.add(num1Field);

        frame.add(new JLabel("Operator:"));
        frame.add(operatorBox);

        frame.add(new JLabel("Number 2:"));
        frame.add(num2Field);

        frame.add(new JLabel("Result:"));
        frame.add(resultField);

        frame.add(new JLabel());  // empty cell
        frame.add(calculateButton);

        // Button action
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    String op = (String) operatorBox.getSelectedItem();
                    double result = 0;

                    switch (op) {
                        case "+": result = num1 + num2; break;
                        case "-": result = num1 - num2; break;
                        case "*": result = num1 * num2; break;
                        case "/": 
                            if (num2 == 0) {
                                resultField.setText("Divide by 0!");
                                return;
                            }
                            result = num1 / num2;
                            break;
                    }

                    resultField.setText(Double.toString(result));
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid input");
                }
            }
        });

        frame.setVisible(true);
    }
}
