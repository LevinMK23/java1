package lesson8.gui;

import javax.swing.*;
import javax.xml.stream.events.Comment;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;

public class FrameWithPanel extends JFrame {

    private int counterOfInputChars, time;
    private JPanel contentPanel;
    private boolean isPressed;
    private Thread timerThread;

    public FrameWithPanel() throws HeadlessException {
        setSize(450, 150);
        setLocation(300, 300);
        counterOfInputChars = 0;
        isPressed = false;
        time = 0;
        GridLayout gl = new GridLayout(1,4);
        contentPanel = new JPanel(gl);
        JScrollPane jsp = new JScrollPane();
        jsp.setLayout(new ScrollPaneLayout());
        JTextField txt = new JTextField();
        contentPanel.add(txt);
        //contentPanel.add(jsp);
        JButton btn = new JButton();
        timerThread = new Thread(() -> {
            while (true) {
                btn.setText(String.valueOf(time) + " sec.");
                time++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        btn.addActionListener(actionEvent -> {
            if (!isPressed) {
                isPressed = true;
                timerThread.start();
            } else {
                timerThread.stop();
            }
        });
        btn.setSize(100, 150);
        JLabel lbl = new JLabel();
        txt.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {
            }

            @Override
            public void keyPressed(KeyEvent keyEvent) {
                System.out.println(keyEvent.paramString());

                if (keyEvent.getKeyCode() == 8) {
                    if (counterOfInputChars > 0) {
                        counterOfInputChars--;
                    }
                } else {
                    counterOfInputChars++;
                }
                lbl.setText(String.valueOf(counterOfInputChars));
            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {
            }
        });
        contentPanel.add(lbl);
        contentPanel.add(btn);
        add(contentPanel);
        System.out.println(gl);
        //setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) throws InterruptedException {
        FrameWithPanel f = new FrameWithPanel();
    }
}
