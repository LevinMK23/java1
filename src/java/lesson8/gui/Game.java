package lesson8.gui;

import javafx.scene.control.Alert;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.GenericArrayType;
import java.util.Random;

public class Game extends JFrame {

    private final static Random rnd = new Random();
    private static int stepCounter = 0;

    public Game() throws HeadlessException {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(450, 450);
        //System.out.println(mSize);
        setLocation(450, 450);
        JPanel panel = new JPanel(new GridLayout(3,3));
        JButton [][] btns = new JButton[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                btns[i][j] = new JButton();
                final JButton copy = btns[i][j];
                copy.addActionListener(actionEvent -> {
                    stepCounter++;
                    copy.setText("X");
                    copy.setEnabled(false);
                    if (stepCounter != 9) {
                        moveAI(btns);
                    } else {
                        this.dispose();
                        JFrame alert = new JFrame("info");
                        alert.setSize(200,90);
                        alert.setLocation(450, 450);
                        JPanel p = new JPanel(new FlowLayout());
                        JButton newGame = new JButton("NEW GAME");
                        JButton close = new JButton("CLOSE");
                        newGame.addActionListener(actionEvent1 -> {
                            alert.dispose();
                            stepCounter = 0;
                            new Game();
                        });
                        close.addActionListener(actionEvent1 -> {
                            alert.dispose();
                        });
                        p.add(newGame);
                        p.add(close);
                        alert.add(p);
                        alert.setVisible(true);
                        alert.setDefaultCloseOperation(EXIT_ON_CLOSE);
                    }
                });

                panel.add(copy);
            }
        }
        add(panel);
        setResizable(false);
        setVisible(true);
    }

    private void moveAI(JButton[][] btns) {
        while (true) {
            int x = rnd.nextInt(3), y = rnd.nextInt(3);
            if (btns[x][y].isEnabled()) {
                btns[x][y].setText("O");
                btns[x][y].setEnabled(false);
                stepCounter++;
                return;
            }
        }
    }

    public static void main(String[] args) {
        new Game();
    }
}
