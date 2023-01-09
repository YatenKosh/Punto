package GUI;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class window extends JFrame {
    private final JLabel lbl1;
    private final JButton buttonVst;
    private final JButton buttonVitr;

    public window() {
        super("моє перше вікно");
        setLayout(new FlowLayout());

        lbl1 = new JLabel("hello? i am first!");
        add(lbl1);
        obrobka o = new obrobka();
        buttonVst = new JButton("Встановити");
        add(buttonVst);
        buttonVst.addActionListener(o);
        buttonVitr = new JButton("Витерти");
        add(buttonVitr);
        buttonVitr.addActionListener(o);
    }

    public class obrobka implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == buttonVst) {
                Calendar c = Calendar.getInstance();
                lbl1.setText(new StringBuilder().append("кнопку натиснули в ").append(c.getTime()).toString());
            } else if (e.getSource() == buttonVitr) {
                lbl1.setText("");
            }
        }
    }
}
