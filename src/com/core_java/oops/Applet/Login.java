package com.core_java.oops.Applet;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="Login" width=400 height=300>
</applet>
*/
public class Login extends Applet implements ActionListener
{
private static final Label TextPassword = null;
Label labelusername,labelpassword,labelresult;
TextField textusername,textpassword;
Button buttonlogin,buttonclear;
public void init()
{
setLayout(new GridLayout(4,2));
labelusername=new Label("User name");
add(labelusername);
textusername=new TextField(30);
add(textusername);
labelpassword=new Label("Password");
add(labelpassword);
textpassword=new TextField(30);
textpassword.setEchoChar('*');
add(textpassword);
buttonlogin=new Button("Login");
add(buttonlogin);
buttonclear=new Button("clear");
add(buttonclear);
labelresult=new Label("Welcome,Ravi");
add(labelresult);
buttonlogin.addActionListener(this);
buttonclear.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{ 
if(ae.getSource()==buttonlogin)
{
if(textusername.getText().equals("shivam")&&textpassword.getText().equals("shivam"))
{
labelresult.setText("Welcome,"+textusername.getText());
}
else
{
labelresult.setText("Welcome,Ravi");
}
}
else
if(ae.getSource()==buttonclear)
{
if(!(textusername.getText().equals(null))&&!(textpassword.getText().equals(null)))
{
textusername.setText("");
TextPassword.setText("");
}
}
}
}