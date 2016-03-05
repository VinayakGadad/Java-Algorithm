/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permutearrays;

import java.util.Random;


/**
 *
 * @author Vinayak
 */
public class RandomizeInPlace {
  public static void randomizeInPlace(int[] a) {
    int n = a.length;
    Random random = new Random();
    random.nextInt();
    for (int i = 0; i < n; i++) {
      int change = i + random.nextInt(n - i);
      int swap = a[i];
        a[i] = a[change];
        a[change] = swap;
    }
  }

  public static void main(String[] args) {
    int[] numbers = { 101, 102, 103, 104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120 };
      System.out.print("Array of integers :");    
    for(int i=0;i<numbers.length;i++)
        {
            System.out.print(numbers[i]+", ");
        }
        System.out.println();
        randomizeInPlace(numbers);
      int[] a = new int[] { 101, 102, 103, 104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120};
    randomizeInPlace(a);
      System.out.print("RandomizeInPlace :");
    for (int i : a) {
      System.out.print(i+", ");
    }
  }
}

