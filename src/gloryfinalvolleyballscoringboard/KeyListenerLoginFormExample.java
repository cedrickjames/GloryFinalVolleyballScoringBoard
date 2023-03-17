package com.javacodegeeks.snipppets.desktop;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerLoginFormExample {
    public static void main(String args[]) {
        JPanel inputPanel = new JPanel();
        JFrame frame = new JFrame("Login Form");
        Container pane = frame.getContentPane();
        JLabel userNameInvalidLabel = new JLabel();
        JLabel userNameLabel = new JLabel("User Name");
        JTextField userNameTextField = new JTextField( 15);
        KeyListener listener = new KeyListener() {
            @Override
            public void keyPressed(KeyEvent event) {
                validateUserName(event);
            }

            @Override
            public void keyReleased(KeyEvent event) {

            }

            @Override
            public void keyTyped(KeyEvent event) {
                validateUserName(event);
            }
            private void validateUserName(KeyEvent event) {
                int num = event.getKeyChar();
                if(!Character.isDigit(event.getKeyChar())) {
                    event.consume();
                }
                if(event.getKeyChar()==KeyEvent.VK_ENTER) {
                    userNameInvalidLabel.setText("Your username is valid!!");
                    userNameTextField.setText("");
                    event.consume();
                }
                else {
                    userNameInvalidLabel.setText("");;
                }
            }
        };
        userNameTextField.addKeyListener(listener);
        inputPanel.add(userNameLabel);
        inputPanel.add(userNameTextField);
        inputPanel.add(userNameInvalidLabel);
        pane.add(inputPanel, BorderLayout.PAGE_START);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,500);
        frame.setVisible(true);

    }
}
