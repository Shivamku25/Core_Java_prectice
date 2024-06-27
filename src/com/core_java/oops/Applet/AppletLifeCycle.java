package com.core_java.oops.Applet;
import java.applet.*;
import java.awt.*;

/*<applet code="AppletLifeCycle" width="350" height="150"></applet>*/

public class AppletLifeCycle extends Applet {

    public void init() {
        setBackground(Color.red);
        System.out.println("init() called");
    }

    public void start() {
        System.out.println("start() called");
    }

    public void paint(Graphics g) {
        System.out.println("paint() called");
    }

    public void stop() {
        System.out.println("stop() called");
    }

    public void destroy() {
        System.out.println("destroy() called");
    }
}
