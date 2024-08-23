package com.core_java.oops.Applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginApplet extends Applet implements ActionListener {
    TextField idField, passwordField;
    Button loginButton,clear;
    Label statusLabel;

    public void init() {
        idField = new TextField(20);
        passwordField = new TextField(20);
        passwordField.setEchoChar('*'); // To hide the password characters
        loginButton = new Button("Login");
        statusLabel = new Label("Enter your ID and password");

        add(new Label("ID: "));
        add(idField);
        add(new Label("Password: "));
        add(passwordField);
        add(loginButton);
        add(statusLabel);

        loginButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String enteredId = idField.getText();
        String enteredPassword = passwordField.getText();

        // Check login credentials (replace with your authentication logic)
        if (enteredId.equals("yourUsername") && enteredPassword.equals("yourPassword")) {
            statusLabel.setText("Login successful!");
        } else {
            statusLabel.setText("Login failed. Please try again.");
        }
    }
}