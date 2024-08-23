package com.core_java.oops.Applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddTwoNumber extends Applet implements ActionListener {
    TextField numField1, numField2;
    Button addButton;
    Label resultLabel;

    public void init() {
        numField1 = new TextField(10);
        numField2 = new TextField(10);
        addButton = new Button("Add");
        resultLabel = new Label("Result: ");

        addButton.addActionListener(this);

        add(numField1);
        add(numField2);
        add(addButton);
        add(resultLabel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            int num1 = Integer.parseInt(numField1.getText());
            int num2 = Integer.parseInt(numField2.getText());
            int sum = num1 + num2;
            resultLabel.setText("Result: " + sum);
        }
    }
}
