package com.core_java.oops.Exception;
import java.util.Scanner;
public class Exc10 {
	 static void splitString(String text){
	        try{  
	            String[] splittedString =text.split("/");  
	            for(int i = 0; i < splittedString.length; i++){
	                System.out.println("Splitted string array of index "+i+" is : "+splittedString[i]);
	            }
	        }  
	        catch(Exception e){
	            System.out.println("Exception while performing division : "+e.toString());
	        }  
	        finally{
	            System.out.println("I am inside finally block");
	        }  
	    }
	    
	    public static void main(String args[]){
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter number 1 : ");
	        String text = scanner.nextLine();
	        if(text.length()>0){
	            splitString(text);
	        }else{
	            //Passing null as input for splitting
	            splitString(null);
	        }
	    }

}
