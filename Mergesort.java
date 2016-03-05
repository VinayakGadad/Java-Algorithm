/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

import java.util.Arrays;

/**
 *
 * @author Vinayak
 */
public class Mergesort {

    /**
     * @param args the command line arguments
     */

		public static void merge_Sort(int[] m) 
		{
			if (m.length > 1) 
			{
				int[] left = leftside(m);
				int[] right = rightside(m);
				merge_Sort(left);
				merge_Sort(right);
				merge(m, left, right);
			}
		}

		public static int[] leftside(int[] m) 
		{
			int size1 = m.length / 2;
			int[] left = new int[size1];
			for (int i = 0; i < size1; i++) 
			{
				left[i] = m[i];
			}
			return left;
		}
                
		public static int[] rightside(int[] m) 
		{
			int size1 = m.length / 2;
			int size2 = m.length - size1;
			int[] right = new int[size2];
			for (int i = 0; i < size2; i++) 
			{
				right[i] = m[i + size1];
			}
			return right;
		}
                
		public static void merge(int[] result, 
				int[] left, int[] right)
		{
			int i1 = 0;   
			int i2 = 0;  
			for (int i = 0; i < result.length; i++) 
			{
				if (i2 >= right.length || (i1 < left.length && 
						left[i1] <= right[i2])) 
				{
					result[i] = left[i1];    
					i1++;
				} 
				else
				{
					result[i] = right[i2];  
					i2++;
				}
			}
                                              
                        
		}
                    public static void main(String[] args) {    
			int[]m ={95, 70, 82, 125, 48, 67, 18, 53};
			merge_Sort(m);
			System.out.println("Merge Sort result is:  " + Arrays.toString(m));
		}
    }
    

