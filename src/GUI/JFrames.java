package GUI;

import static javax.swing.JFrame.*;

public class JFrames {
    public static void main(String[] args) {
        window w = new window();
        w.setSize(400, 200);
        w.setVisible(true);
        w.setDefaultCloseOperation(EXIT_ON_CLOSE);
        w.setTitle("window with button");

//        guid guid = new guid();
//        guid.setVisible(true);
    }
}
