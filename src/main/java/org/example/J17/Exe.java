package org.example.J17;

import javax.swing.*;
import java.awt.*;

public class Exe {
    public static void execute() {
        JFrame frame = new JFrame("はじめてのSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);

        frame.setLayout(new FlowLayout());
        JLabel label = new JLabel("Hello World");
        frame.add(label);
        JButton button = new JButton("Push me!");
        frame.add(button);

        frame.setVisible(true);
        System.out.println("フレームを表示");
    }
}
