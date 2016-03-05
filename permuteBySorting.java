/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permutearrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Vinayak
 */
public class permuteBySorting {
 public static void main(String[] args) {
       
        int[] numbers = { 1, 2, 3, 4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20 };
        System.out.print("Array of integers : ");
        for(int i=0;i<numbers.length;i++)
        {
            System.out.print(numbers[i]+", ");
        }
        System.out.println();
        permuteBySorting(numbers);
    }
    public static void permuteBySorting(int[] numbers){
        int[] randPriority = {98,16,50,55,76,61,34,34,55,44,24,54,12,13,21,65,77,63,87,34};
        final int A = numbers.length;
        
        List<prioritized<Integer>> list =
            new ArrayList<prioritized<Integer>>(A);
        for (int i = 0; i < A; i++) {
            list.add(new prioritized<Integer>(numbers[i], randPriority[i]));
        }
        Collections.sort(list);
        int[] permuted = new int[A];
        System.out.print("Priorities of Array:"+Arrays.toString(randPriority));
        System.out.println("");
        System.out.print("Permute by Sorting: ");
        for (int i = 0; i < A; i++) {
            permuted[i] = list.get(i).value;
        }
        System.out.println(Arrays.toString(permuted));
    }
}

class prioritized<P> implements Comparable<prioritized<P>> {
    final P value;
    final int priority;
    prioritized(P value, int priority) {
        this.value = value;
        this.priority = priority;
    }
     public int compareTo(prioritized other) {
        return Integer.valueOf(this.priority).compareTo(other.priority);
    }          
}

