import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

class NextPage {
    JFrame previousFrame;

    public NextPage(JFrame previousFrame) {
        this.previousFrame = previousFrame;

        JFrame nextPageFrame = new JFrame("Next Page");

        nextPageFrame.setSize(400, 600);
        nextPageFrame.setLocationRelativeTo(null);
        nextPageFrame.setLayout(null);
        nextPageFrame.getContentPane().setBackground(Color.PINK);
        nextPageFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel("Welcome to the Next Page");
        label.setBounds(100, 50, 200, 50);
        nextPageFrame.add(label);

        JButton back = new JButton("Back");
        back.setBounds(150, 200, 100, 30);  // Adjusted position to avoid overlap
        nextPageFrame.add(back);

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nextPageFrame.dispose();
                previousFrame.setVisible(true);
            }
        });

        nextPageFrame.setVisible(true);
    }
}

public class asif {

    public static void main(String[] args) {
        JFrame asif = new JFrame("Login Page");
        asif.setSize(400, 600);
        asif.setLocationRelativeTo(null);
        asif.setLayout(null);
        asif.getContentPane().setBackground(Color.PINK);
        asif.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JLabel manju = new JLabel("LOGIN PAGE");
        manju.setBounds(155, 60, 100, 100);

        JLabel manju1 = new JLabel("USER");
        manju1.setBounds(50, 136, 100, 100);

        JTextField chetan = new JTextField();
        chetan.setBounds(130, 170, 140, 29);

        JLabel akash = new JLabel("PASSWORD");
        akash.setBounds(50, 180, 100, 100);

        JPasswordField chetan1 = new JPasswordField();
        chetan1.setBounds(130, 215, 140, 29);

        JButton login = new JButton("login");
        login.setBounds(200, 280, 80, 30);

        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String zoro = chetan.getText();
                String namiString = new String(chetan1.getPassword());
                if (zoro.equals("chetan123") && namiString.equals("8003")) {
                    JOptionPane.showMessageDialog(asif, "Successfully logged in");
                    asif.setVisible(false);
                    new NextPage(asif);

                } 
                
                else 
                
                {
                    JOptionPane.showMessageDialog(asif, "wrong user Or Password");
                }
            }
        });

        JButton reset = new JButton("Reset");
        reset.setBounds(90, 280, 80, 30);

        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                chetan.setText("");
                chetan1.setText("");
            }
        });

        asif.add(manju);
        asif.add(manju1);
        asif.add(chetan);
        asif.add(akash);
        asif.add(chetan1);
        asif.add(login);
        asif.add(reset);

        asif.setVisible(true);
    }
}
