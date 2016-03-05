/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smallestlargest;

/**
 *
 * @author Vinayak
 */
public class SmallestLargest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int num[] = new int[] {95, 70, 82, 125, 48, 63, 18, 53};
		int Snum = num[0];
		int Lnum = num[0];
		for(int i=1; i< num.length; i++)
		 {
		if(num[i] > Lnum)
		 Lnum = num[i];
		 else if (num[i] < Snum)
		 Snum = num[i];
		 		}
		  System.out.println(" The  Smalest number is " + Snum);
		  	  System.out.println(" The  largest number is " + Lnum);             
		 	}
    }
    

