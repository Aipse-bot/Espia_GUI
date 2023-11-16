package FoodOrderingSystem;

import SimpleCalculator.SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderSystem extends JFrame{
    private JCheckBox pizzaCheckBox;
    private JCheckBox burgerCheckBox;
    private JCheckBox friesCheckBox;
    private JCheckBox softDrinksCheckBox;
    private JCheckBox teaCheckBox;
    private JCheckBox sundaeCheckBox;
    private JRadioButton noneRadioButton;
    private JRadioButton a5OffRadioButton;
    private JRadioButton a10OffRadioButton;
    private JRadioButton a15OffRadioButton;
    private JPanel jpanel;
    private JButton orderButton;

    public FoodOrderSystem(){
        orderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double total = 0;
                if (pizzaCheckBox.isSelected()) total += 100;
                if (burgerCheckBox.isSelected()) total += 80;
                if (friesCheckBox.isSelected()) total += 65;
                if (softDrinksCheckBox.isSelected()) total += 55;
                if (teaCheckBox.isSelected()) total += 50;
                if (sundaeCheckBox.isSelected()) total += 40;

                // Apply discount if selected
                if (a5OffRadioButton.isSelected()) total -= total*.05;
                else if (a10OffRadioButton.isSelected()) total -= total*0.10;
                else if (a15OffRadioButton.isSelected()) total -= total*0.15;
            JOptionPane.showMessageDialog(null, "The Total price is Php " + String.format("%.2f", total));
            }
        });
    }

    public static void main(String[] args) {
        FoodOrderSystem app = new FoodOrderSystem();
        app.setContentPane(app.jpanel);
        app.setSize(300, 200);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Food Ordering System");
    }
}
