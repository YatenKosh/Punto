package javaOOP2.TestThread1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bomb extends JFrame {
    private final JLabel timeLabel;
    private final Timer timer;
    private final JButton start;

    public bomb() {
        setTitle("MyTimeBomb");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Monospaced", Font.BOLD, 80));
        timer = new Timer(1000, new TimerTick());
        start = new JButton("Start");
        start.addActionListener(e -> {
            remove(start);
            add(timeLabel);
            validate();
            repaint();
            timer.start();
        });
        add(start);
        setPreferredSize(new Dimension(400, 150));
        setLocationRelativeTo(null);
        pack();
    }

    public static void main(String[] args) {
        new bomb().setVisible(true);
    }

    class TimerTick implements ActionListener {
        int countdown = 10;

        @Override
        public void actionPerformed(ActionEvent e) {
            countdown--;
            timeLabel.setText(String.valueOf(countdown));
            if (countdown == 0) {
                timeLabel.setText("Boom!!!");
                timer.stop();
                setDefaultCloseOperation(1);
            }
        }
    }
}