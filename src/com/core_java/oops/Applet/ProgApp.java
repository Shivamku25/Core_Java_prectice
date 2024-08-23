package com.core_java.oops.Applet;

import java.applet.*;
import java.awt.*;
/*
<applet code="ParamApplet" width="300" height="300">
<param name="num1" value="40">
<param name="num2" value="60">
</applet>
*/
public class ProgApp extends Applet {
    int a, b, c;

    public void init() {
        a = Integer.parseInt(getParameter("num1"));
        b = Integer.parseInt(getParameter("num2"));
        c = a + b;
    }

    public void paint(Graphics g) {
    	Font myFont = new Font("courier new ",1,25);
 	   g.setFont(myFont);
        g.drawString("Sum: " + c, 30, 30);
    }
}
