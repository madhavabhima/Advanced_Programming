package com.ctu.dietel.chapter2;

/* Displays the numbers 1 To 4 using
 * 
 * 	a) one System.out.println statement
 *  b) four System.out.print statements
 *  c) one System.out.printf statement
 */
public class DisplayNumbersOneToFour {

	public static void main(String[] args) {
		
		System.out.println ("Displays The numbers 1 To 4 using \n"
                + "\t a) one System.out.println statement \n"
                + "\t b) four System.out.print statements \n"
				+ "\t c) one System.out.printf statement \n");
        
		System.out.println ("1 2 3 4");  
        
        System.out.print ("1 "); 
        System.out.print ("2 "); 
        System.out.print ("3 "); 
        System.out.print ("4 \n"); 
        
        System.out.printf ("%d %d %d %d\n", 1,2,3,4);  

	}

}
