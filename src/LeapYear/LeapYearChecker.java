package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearChecker extends JFrame{

    private JButton checkButton;
    private JTextField textField1;
    private JPanel jpanel;

    public LeapYearChecker(){

        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle the action event when the button is clicked
                String InputYear = textField1.getText();

                try {
                    int year = Integer.parseInt(InputYear);

                    if (isLeapYear(year)) {
                        JOptionPane.showMessageDialog(null, year + " is a leap year!");
                    } else {
                        JOptionPane.showMessageDialog(null, year + " is not a leap year.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid year.");
                }
            }

            // Method to check if a year is a leap year
            private boolean isLeapYear(int year) {
                return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            }


        });


    }

    public static void main(String[] args) {
        LeapYearChecker app = new LeapYearChecker();
        app.setContentPane(app.jpanel);
        app.setSize(200, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Leap Year Checker");
    }
}