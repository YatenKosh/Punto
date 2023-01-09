package GUI;

import javax.swing.JOptionPane;

public class gui {
    public static void main(String[] args) {
        /*    String imya = JOptionPane.showInputDialog("ВВедіть своє імя: ");
        String prizv = JOptionPane.showInputDialog("ВВедіть своє прізвище: ");
        String priv = String.format("ВІтаємо у нашій віконній програмі, %s %s", imya, prizv);
        JOptionPane.showMessageDialog(null, priv, "Красавчик", JOptionPane.PLAIN_MESSAGE);
*/
        String d1 = JOptionPane.showInputDialog("Введіть перше число:");
        double c1 = Double.parseDouble(d1);
        String d2 = JOptionPane.showInputDialog("Введіть друге число:");
        double c2 = Double.parseDouble(d2);
        String dija = JOptionPane.showInputDialog("Введіть дію (+-*/)...");
        double rez = 0;

        if (dija.equals("/") && c2 == 0) {
            String pomylka = "Ай-ай, ділити на нуль не можна!";
            JOptionPane.showMessageDialog(null, pomylka, "ПОМИЛКА!", JOptionPane.PLAIN_MESSAGE);
            return;
        }

        switch (dija) {
            case "+" -> rez = c1 + c2;
            case "-" -> rez = c1 - c2;
            case "*" -> rez = c1 * c2;
            case "/" -> rez = c1 / c2;
        }

        String result = String.format("Результат обрахунку: %s", rez);
        JOptionPane.showMessageDialog(null, result, "РЕЗУЛЬТАТ", JOptionPane.PLAIN_MESSAGE);
    }
}
