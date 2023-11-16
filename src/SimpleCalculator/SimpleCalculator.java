package SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox<String> comboBox1;
    private JTextArea textArea1;
    private JButton computeResultButton;
    private JPanel jpanel;

    public SimpleCalculator() {
        computeResultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    int left = Integer.parseInt(textField1.getText());
                    int right = Integer.parseInt(textField2.getText());
                    String operation = (String) comboBox1.getSelectedItem();


                    int result = 0;
                    switch (operation) {
                        case "+":
                            result = left + right;
                            break;
                        case "-":
                            result = left - right;
                            break;
                        case "/":
                            result = left/right;
                            break;
                        case "*":
                            result = left * right;
                            break;


                        default:
                            textArea1.setText("Invalid operation");
                            return;
                    }


                    textArea1.setText(String.valueOf(result));

                } catch (NumberFormatException ex) {
                    textArea1.setText("Invalid input. Please enter valid integers.");
                }
            }
        });
    }

    public static void main(String[] args) {
        SimpleCalculator app = new SimpleCalculator();
        app.setContentPane(app.jpanel);
        app.setSize(300, 200);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Simple Calculator");
    }
}
