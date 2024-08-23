package com.core_java.oops.Applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpApplet extends Applet implements ActionListener {
     TextField usernameField, passwordField, confirmPasswordField;
     Button signUpButton;

    public void init() {
        setLayout(null);

        Label titleLabel = new Label("Sign Up Form");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        titleLabel.setBounds(150, 20, 200, 20);
        add(titleLabel);

        Label usernameLabel = new Label("Username:");
        usernameLabel.setBounds(50, 60, 80, 20);
        add(usernameLabel);

        usernameField = new TextField();
        usernameField.setBounds(150, 60, 200, 20);
        add(usernameField);

        Label passwordLabel = new Label("Password:");
        passwordLabel.setBounds(50, 90, 80, 20);
        add(passwordLabel);

        passwordField = new TextField();
        passwordField.setEchoChar('*');
        passwordField.setBounds(150, 90, 200, 20);
        add(passwordField);

        Label confirmPasswordLabel = new Label("Confirm Password:");
        confirmPasswordLabel.setBounds(50, 120, 120, 20);
        add(confirmPasswordLabel);

        confirmPasswordField = new TextField();
        confirmPasswordField.setEchoChar('*');
        confirmPasswordField.setBounds(170, 120, 180, 20);
        add(confirmPasswordField);

        signUpButton = new Button("Sign Up");
        signUpButton.setBounds(150, 160, 80, 30);
        signUpButton.addActionListener(this);
        add(signUpButton);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == signUpButton) {
            String username = usernameField.getText();
            String password = passwordField.getText();
            String confirmPassword = confirmPasswordField.getText();

            // Perform sign-up validation and processing

            // For simplicity, just print the values for now
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
            System.out.println("Confirm Password: " + confirmPassword);
            
        }
    }
}
