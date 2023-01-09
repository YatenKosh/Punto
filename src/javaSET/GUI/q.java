package javaSET.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class q {

    private static void createGUI() {
        JList<String> list = new JList<>();
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane listScrollPane = new JScrollPane(list);

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        topPanel.add(listScrollPane, BorderLayout.CENTER);

        ActionListener updateButtonListener = new UpdateListAction(list);
        updateButtonListener.actionPerformed(
                new ActionEvent(list, ActionEvent.ACTION_PERFORMED, null)
        );

        JButton updateListButton = new JButton("Update list");
        JButton updateLookAndFeelButton = new JButton("Update Look&Feel");

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.LINE_AXIS));
        jPanel.add(updateListButton);
        jPanel.add(Box.createHorizontalStrut(5));
        jPanel.add(updateLookAndFeelButton);

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(jPanel);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        panel.setLayout(new BorderLayout());
        panel.add(topPanel, BorderLayout.CENTER);
        panel.add(bottomPanel, BorderLayout.SOUTH);

        JFrame frame = new JFrame("Look&Feel Switcher");
        frame.setMinimumSize(new Dimension(300, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

        updateListButton.addActionListener(updateButtonListener);
        updateLookAndFeelButton.addActionListener(
                new UpdateLookAndFeelAction(frame, list));
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(q::createGUI);
    }
}
