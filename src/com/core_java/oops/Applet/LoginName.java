package com.core_java.oops.Applet;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/* <applet code="LoginName.class" height=1000 width=1000></applet>*/

public class LoginName extends Applet implements ActionListener
{
String name=" ", gender=" ";
int age;
TextField n=new TextField(10);
CheckboxGroup g=new CheckboxGroup(); 
Checkbox m=new Checkbox("male",g,true);
Checkbox f=new Checkbox("female",g,false);
Choice c=new Choice();
Label l1=new Label("Enter Name:");
Label l2=new Label("Selec Gender:");
Label l3=new Label("age:");
Button b=new Button("Button");
public void init()
{
b.setBackground(Color.red);
c.setBackground(Color.red);
setBackground(Color.black);
setForeground(Color.white);
add(l1);
add(n);
add(l2);
add(m);
add(f);
add(l3);
c.add("10");
c.add("15");
c.add("20");
c.add("25");
c.add("30");
c.add("35");
add(c);
add(b);
b.addActionListener(this);
}
public void paint(Graphics g)
{
g.drawString("name: "+name,20,100);
g.drawString("Gender: "+gender,20,120);
g.drawString("age: "+age,20,140);
}
public void actionPerformed(ActionEvent e)
{
	name=n.getText();
	gender=g.getSelectedCheckbox().getLabel();
	age=Integer.parseInt(c.getSelectedItem());
	repaint();
	}
   
}

 