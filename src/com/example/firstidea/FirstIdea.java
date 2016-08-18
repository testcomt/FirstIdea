package com.example.firstidea;

import javax.swing.*;

/**
 * Created by taixiaomei on 7/23/16.
 */
public class FirstIdea {
    public static void main(String[] args) {
        System.out.println("FirstIdea.main");
        System.out.println("HelloWorld");

        JFrame frame = new JFrame("App");
        frame.setContentPane(new AppSwing().panelMain);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
}

}
