package com.example.firstidea;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by taixiaomei on 8/18/16.
 */
public class AppSwing {
    public JButton ButtonItem;
    public JPanel panelMain;
    private JLabel lblA;
    private JLabel lblOp;
    private JLabel lblB;
    private JTextField textAnswer;
    private JButton buttonJudge;
    private  double result=0.0;

    public AppSwing() {



        ButtonItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                int a = (int) (Math.random()*9+1);
                int b = (int) (Math.random()*9+1);
                int sign = (int) (Math.random()*4+1);
                String op="";

                switch (sign)
                {
                    case 1:
                        op="+";
                        result =a+b;break;
                    case 2:
                        op="-";
                        result =a-b;break;
                    case 3:
                        op="*";
                        result =a*b;break;
                    case 4:
                        op="/";
                        result =a/b;break;
                }

                lblA.setText(""+a);
                lblB.setText(""+b);
                lblOp.setText(""+op);
                textAnswer.setText("");
            }
        });


        buttonJudge.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = textAnswer.getText();
                double inputResult = Double.parseDouble(str);
                if (result==inputResult)
                    JOptionPane.showMessageDialog(null,"Your answer is right!");
                else
                    JOptionPane.showMessageDialog(null,"Sorry, wrong answer!");

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new AppSwing().panelMain);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
