package Day_1to3;

import java.util.Arrays;

public class Task4 {
	public static void main(String[] args) {
		
		//Initialize an integer array.
			int[] arr=new int[10];
			
		//Fill array values from o to 9.
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=i;
			}
			
		//Print original array.	
			System.out.println("Array values");
			System.out.println(Arrays.toString(arr));

		//Reverse array values in loop.	
			for(int i=0;i<=(arr.length-1)/2;i++)
			{
				
		//Swap array element at a position of i and (arr.length-1-i).		
				int temp=arr[i];
				arr[i]=arr[arr.length-1-i];
				arr[arr.length-1-i]=temp;
			}
			
		//Print reversed array values.	
		   System.out.println("\nReversed array values");
		   System.out.println(Arrays.toString(arr));
	  }

}
