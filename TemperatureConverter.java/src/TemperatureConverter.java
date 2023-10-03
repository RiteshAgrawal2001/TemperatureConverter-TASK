import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConverter {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Temperature Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel inputLabel = new JLabel("Enter Temperature (°C):");
        JTextField inputField = new JTextField(10);
        JLabel outputLabel = new JLabel("Converted Temperature (°F):");
        JTextField outputField = new JTextField(10);
        outputField.setEditable(false);

        JButton convertButton = new JButton("Convert");

        panel.add(inputLabel);
        panel.add(inputField);
        panel.add(outputLabel);
        panel.add(outputField);
        panel.add(convertButton);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double celsius = Double.parseDouble(inputField.getText());
                    double fahrenheit = (celsius * 9 / 5) + 32;
                    outputField.setText(String.format("%.2f", fahrenheit));
                } catch (NumberFormatException ex) {
                    outputField.setText("Invalid Input");
                }
            }
        });

        frame.setVisible(true);
    }
}
