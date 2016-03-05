
import java.util.Arrays;

/**
 *
 * @author Vinayak
 */
public class HeapSort {
   public static int heapSize;
   public static int leftChild(int i)
    {
        return i;
    }
    public static int rightChild(int i)
    {
        return i;
    }
    
    //    Create the maxHeapify method
    public static void maxHeapify(int A[],int i)
    {
        
        int lElement = -1;
        int ltChild=leftChild(2*i+1);
        int rtChild=rightChild(2*i+2);
        
        if(ltChild<heapSize && A[ltChild]>A[i]){
            lElement = ltChild;
        }
        else{
            lElement=i;
        }
         if(rtChild<heapSize && A[rtChild]>A[lElement]){
            lElement = rtChild;
        }
         
        if(lElement!=i){
            int temp = A[i];
            A[i]=A[lElement];
            A[lElement]=temp;
            maxHeapify(A, lElement);
        }
    }
    
//    Implement the buildMaxHeap method and the heapSort method.
    public static void buildMaxHeap(int A[])
    {
        heapSize = A.length; 
        for(int i=A.length/2; i>=0;i--)
        {
            maxHeapify(A, i);
        }
    }
    
    public static void heapSort(int A[])
    {
    buildMaxHeap(A);
  
    for(int i=A.length-1;i>=0;i--)
    {
       int temp = A[0];
        A[0]=A[i];
        A[i]=temp;
       heapSize  = heapSize-1;
       maxHeapify(A,0);
    }
    }
     


public static void main(String[] args) {
    int[] array = new int[]{10, 15, 8, 12, 5, 2, 20, 7, 18};
    System.out.println("The original input array");
    System.out.println(Arrays.toString(array));
    buildMaxHeap(array);
    System.out.println("\nThe array after buildMAxHeap method");
    System.out.println(Arrays.toString(array));  
    heapSort(array);
    System.out.println("\nThe final sorted array after performing the Heapsort algorithm");
    System.out.println(Arrays.toString(array));
}

}
