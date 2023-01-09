package javaSET.DemoGuiSwing;

import javax.swing.*;
import java.awt.*;

public class MyApplication extends JFrame {

    public MyApplication(String name, int location, int size, boolean visible) throws HeadlessException {
    }

    public MyApplication(GraphicsConfiguration gc, String name, int location, int size, boolean visible) {
        super(gc);
    }

    public MyApplication(String title, String name, int location, int size, boolean visible) throws HeadlessException {
        super(title);
    }

    public MyApplication(String title, GraphicsConfiguration gc, String name, int location, int size, boolean visible) {
        super(title, gc);
    }

    public void setName(String name) {
    }

    public void setLocation(int location) {
    }

    public void setSize(int size) {
    }

    public void setVisible(boolean visible) {
    }

}

