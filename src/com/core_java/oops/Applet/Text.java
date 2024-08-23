package com.core_java.oops.Applet;

import java.awt.*;    
import java.applet.*;   
/* <applet code = "fon.class" height = 500 width =500>  
  </applet> */

public class Text extends Applet    
 {    
   Font f1,f2,f3;    
    
   public void  init()    
    {    
       f1 = new Font("Arial",Font.BOLD,18);    
       f2 = new Font("Forte",Font.PLAIN,24);    
       f3 = new Font("Elephant",Font.ITALIC,28);    
    }    
          
   public void  paint(Graphics g)    
   {    
	   Font myFont = new Font("courier new ",1,25);
	   g.setFont(myFont);
      g.drawString("Ravi",50,50);    
    
      g.setFont(f1);     
      g.drawString("Shivam",50,80);    
    
      g.setFont(f2);     
      g.drawString("Ankit",50,110);    
    
      g.setFont(f3);     
      g.drawString("Aman",50,140);    
   }    
 }    
    
