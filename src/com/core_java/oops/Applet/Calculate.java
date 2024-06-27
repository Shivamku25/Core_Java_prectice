 

package com.core_java.oops.Applet;
  
   import java.awt.*;
   import java.applet.*;
   import java.awt.event.*;
   
    public class Calculate extends Applet implements ActionListener{
	TextField text1,text2,text3,output;
      Label label1,label2,label3,title;
      Button button,button1,button2,button3,clear;
      public void init(){
        
        setLayout(null);
        title = new Label("Calculator");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setBounds(100,10,140,20);
        add(title);
        title.setAlignment(title.CENTER);
        title.setBackground(Color.yellow);   
        label1 = new Label("Enter Number 1: ");
        label1.setBounds(20,50,100,20);
        add(label1);
        label1.setFont(new Font("Arial", Font.BOLD, 20));

        text1 = new TextField(5);
        text1.setBounds(150,50,100,20);
        add(text1);

        label2 = new Label("Enter Number 2: ");
        label2.setBounds(20,90,100,20);
        add(label2);
        label2.setFont(new Font("Arial", Font.BOLD, 20));

        text2 = new TextField(5);
        text2.setBounds(150,90,100,20);
        add(text2);

        label3 = new Label("Result : ");
        label3.setBounds(20,130,130,30);
        add(label3);
        label3.setFont(new Font("Arial", Font.BOLD, 20));

        output = new TextField(5);
        output.setBounds(150,130,100,20);
        add(output);

        button = new Button("Sum");
        button.setBounds(150,170,100,20);
        add(button);
        button.addActionListener(this);
        button1  = new Button ("Mul");
        button1.setBounds(550,170,100,20);
        add(button1);
        button1.addActionListener(this);
        button2  = new Button ("Sub");
        button2.setBounds(400,170,100,20);
        add(button2);
        button2.addActionListener(this);
        button3 =new Button("Div");
        button3.setBounds(700,170,100,20);
        add(button3);
        button3.addActionListener(this);
        clear = new Button("Clear");
        clear.setBounds(280,170,100,20);
        add(clear);
        clear.addActionListener(this);
        button.setFont(new Font("Arial", Font.BOLD, 15));
        button1.setFont(new Font("Arial", Font.BOLD, 15));
        button2.setFont(new Font("Arial", Font.BOLD, 15));
        button3.setFont(new Font("Arial", Font.BOLD, 15));
        clear.setFont(new Font("Arial", Font.BOLD, 15));
        }
      
        public void actionPerformed(ActionEvent ae){
        	if(ae.getSource() == button)
        	{
        int num1=Integer.parseInt(text1.getText());
        int num2=Integer.parseInt(text2.getText());
        int Sum=num1+num2;
        output.setText(Integer.toString(Sum));
        	}
        	if(ae.getSource() == button2)
        	{ 
        		int num1=Integer.parseInt(text1.getText());
                int num2=Integer.parseInt(text2.getText());
                int Sub=num1-num2;
                output.setText(Integer.toString(Sub));
                
        	}
        	if(ae.getSource() == button1)
        	{
        		int num1=Integer.parseInt(text1.getText());
                int num2=Integer.parseInt(text2.getText());	
                int mul=num1*num2;
                output.setText(Integer.toString(mul));
        	}
        	if(ae.getSource() == button3)
        	{
        		int num1=Integer.parseInt(text1.getText());
                int num2=Integer.parseInt(text2.getText());	
                int div=num1/num2;
                output.setText(Integer.toString(div));
        	}
         
        if(ae.getSource() == clear)
        {
        text1.setText("");
        text2.setText("");
        output.setText("");
        text1.requestFocus();
    }
}
          public static void main(String args[]){  
        	Calculate f=new Calculate(); 
        	
        }
}