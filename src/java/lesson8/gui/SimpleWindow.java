package lesson8.gui;

import javax.swing.*;
import java.awt.*;

public class SimpleWindow extends JFrame {

    public SimpleWindow() throws HeadlessException {
        setSize(500, 500);
        setLocation(300, 300);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) throws InterruptedException {
        SimpleWindow win = new SimpleWindow();
//        int x = 0, y = 0;
//        while (true) {
//            win.setLocation(x++, y++);
//            Thread.sleep(30);
//        }
    }
}
