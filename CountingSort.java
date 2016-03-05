/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs501l_hw5_vinayakgadad_15226;

/**
 *
 * @author Vinayak
 */
public class CountingSort {
    int[] c;
	public static final strictfp void main(String... args) {
		int array_A[]={6,0,2,0,1,3,4,6,1,3,2};
		int k[]=new int[array_A.length];
		System.out.print("The Original Input Array A\n");
		for(int i=0;i<array_A.length;i++){
			System.out.print(array_A[i]+" | ");
		}
                System.out.println("");
		CountingSort cs= new CountingSort();
		cs.countingsort(array_A,k,6);
		System.out.print("\n\nThe Final Sorted array\n");
		for(int i=0;i<k.length;i++){
			System.out.print(k[i]+" | ");
		}
                System.out.println("");
	}
        
        public void countingsort(int[] A, int[]B ,int k){
		c=new int[k+1];
		for(int i=0;i<=k;i++){
			c[i]=0;

		} 
		for(int j=0;j<A.length;j++){
			c[A[j]]=c[A[j]]+1;
		}
		System.out.print("\nThe counting array C after the counting (lines 4-5 in pseudocode) has completed\n" );
		for(int p=0;p<c.length;p++){
			System.out.print(+c[p]+" | ");}

		for(int i=1;i<=k;i++){
			c[i]=c[i]+c[i-1];
		}
		System.out.print("\nThe counting array C after the summing (lines 7-8 in pseudocode) has completed\n");
		for(int p=0;p<c.length;p++){
			System.out.print(+c[p]+" | ");
		}

		for(int j=A.length-1;j>=0;j--){
			B[c[A[j]]-1]=A[j];
			c[A[j]]=c[A[j]]-1;
		}
	}
}
