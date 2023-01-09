package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class guid extends JFrame {
    private final JTextField input = new JTextField("", 5);
    private final JRadioButton radio1 = new JRadioButton("Select this: ");
    private final JCheckBox checkBox = new JCheckBox("check", false);

    public guid() {
        super("Simple example");
        this.setBounds(100, 100, 250, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        JLabel label = new JLabel("Input: ");
        container.add(label);
        container.add(input);
        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        JRadioButton radio2 = new JRadioButton("Select this: ");
        group.add(radio2);
        container.add(radio1);
        radio1.setSelected(true);
        container.add(radio2);
        container.add(checkBox);
        JButton button = new JButton("Press");
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }
        class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            String message = "";
            message += "Button lost pressed\nText is " + input.getText() + "\n" + (radio1.isSelected() ?
                    "Radio1" : "radio2") + " is selected!\n" + "Check is " + ((checkBox.isSelected()) ? "checked" : "unchecked");
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);

        }
    }

}
