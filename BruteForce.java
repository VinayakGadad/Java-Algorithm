/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bruteforce;

/**
 *
 * @author Vinayak
 */
public class BruteForce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] price = {100,113,110,85,105,102,86,63,81,101,94,106,101,79,94,90,97};
                        int max_sum = 0 ,max_buy_date = 0,max_sell_date = 0;
                        int buy_date , sell_date , sum , result ;

			int len = price.length;
			int Array[]= new int[len-1];
			for(int i=0;i<len-1;i++)
			{
				Array[i] = price[i+1] - price[i];
			}
			
			for(int i = 0; i < Array.length-1; i++)
			{

				sum = Array[i] + Array[i+1];
				result = sum;
				buy_date = i;
				sell_date = i+1;

				for(int j=i+2; j<Array.length-1; j++)
				{
					result = result + Array[j];
					if(sum < result)
					{
						sum = result;
						sell_date = j;
					}
				}

				if(sum > max_sum)
				{
					max_sum = sum;
					max_sell_date = sell_date + 1;
					max_buy_date = buy_date;
				}
			}

			System.out.println("The max profit is " + max_sum);
			System.out.println("Buy On day " + max_buy_date + " and sell On day " + max_sell_date);

    }
    
}
