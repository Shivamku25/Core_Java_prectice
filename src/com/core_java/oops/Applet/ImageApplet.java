package com.core_java.oops.Applet;

import java.applet.*;
import java.awt.*;
/*<applet code=" ImageApplet" width=300 height=300>
</applet>
 */
public class ImageApplet extends Applet
{
	Image img;
	public void init()
	{
		img = getImage(getDocumentBase(),"one.jpg");
	}
	public void paint(Graphics g)
	{
		g.drawImage(img, 30, 30, this);
	}

}
