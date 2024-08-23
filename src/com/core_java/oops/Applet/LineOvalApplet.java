package com.core_java.oops.Applet;
import java.applet.*;
import java.awt.*;

public class LineOvalApplet extends Applet {
    int a, b, c;

    public void init() {
        setBackground(Color.red);
        setForeground(Color.yellow);

        // Check if "num1" and "num2" parameters are provided
        String param1 = getParameter("num1");
        String param2 = getParameter("num2");

        // Default values if parameters are not provided
        a = (param1 != null) ? Integer.parseInt(param1) : 10;
        b = (param2 != null) ? Integer.parseInt(param2) : 10;

        c = a + b;
    }

    public void paint(Graphics g) {
    	g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("sum =" + c, 50, 40);
        g.drawLine(300, 100, 40, 80);
        g.drawOval(20, 200, 200, 200);
    }
}
