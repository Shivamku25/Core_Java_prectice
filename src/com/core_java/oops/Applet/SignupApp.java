package com.core_java.oops.Applet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignupApp extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextField emailField;

    public SignupApp() {
        // Set frame properties
        setTitle("Signup App");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");
        JLabel emailLabel = new JLabel("Email:");

        usernameField = new JTextField(15);
        passwordField = new JPasswordField(15);
        emailField = new JTextField(15);

        JButton signupButton = new JButton("Signup");

        // Add action listener to the signup button
        signupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performSignup();
            }
        });

        // Create layout
        setLayout(new GridLayout(4, 2));

        // Add components to the frame
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(emailLabel);
        add(emailField);
        add(new JLabel()); // Empty label for spacing
        add(signupButton);

        // Display the frame
        setVisible(true);
    }

    private void performSignup() {
        String username = usernameField.getText();
        char[] passwordChars = passwordField.getPassword();
        String password = new String(passwordChars);
        String email = emailField.getText();

        // Add your signup logic here
        // For simplicity, we will just display the entered details in a message
        JOptionPane.showMessageDialog(this, "Username: " + username + "\nPassword: " + password + "\nEmail: " + email);

        // Clear fields after signup attempt
        usernameField.setText("");
        passwordField.setText("");
        emailField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SignupApp();
            }
        });
    }
}
