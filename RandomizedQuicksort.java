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
public class RandomizedQuicksort {
    int[] array=new int[]{4,1,3,2,16,9,10,14,8,7};          
        public static void main(String[] args)
	{
		RandomizedQuicksort ranqs = new RandomizedQuicksort();

		System.out.println("The original input array");
		ranqs.original();  
		ranqs.sort(); 
		System.out.println("\n\nThe final sorted array after performing the Quicksort algorithm");
		ranqs.original();                
	}  
	public void sort()          
	{
		randomizedPartition(array, 0, array.length-1);
 
	}

	public void swap(int a, int b)  
	{
		int temp = array[a];        
		array[a] = array[b];   
		array[b] = temp;             
	} 

	public void randomizedPartition(int array[],int first,int last)      
	{
		int mid;
		if (first<last) {
                    int pivot=array[last];
		int i=first-1;
		for(int j=first;j<=last-1;j++){
			if(array[j]<pivot){
				i=i+1;
				swap(i,j);
			}
		}
		swap(i+1,last);
                
			mid=i+1;
			System.out.println("\n The sub-arrays after each of the randomizedPartition calls has completed");
			inputArray(first,mid-1);
			inputArray(mid+1,last);
			randomizedPartition(array,first,mid-1);
			randomizedPartition(array,mid+1,last);
		}
	}

	public void inputArray(int m, int n)             
	{
		for(int j=m; j<=n; j++)    
			System.out.print(array[j] + " ");  
	}
	public void original()
	{

		inputArray(0,array.length-1);
                System.out.println("");
	}

	
}
