package Day_1to3;

import java.util.Arrays;

public class Task6 {
	public static void main(String[] args) {
		
		//Initialize an array with elements.
			int[] arr= {7,2,7,4,5,5};
			
			System.out.println(Arrays.toString(arr));
		//calculate a length of the array and store it in x variable.	
			int x=arr.length-1;
			
		//call sumArray function to print sum of array elements.	;
	        System.out.println("\nsum of array: "+sumArray(arr,x));
		}
		
		
		static int sumArray(int[] arr,int x)
		{
		/*check x is equal to -1 
	    -1 means array index reached last index of the array*/
			if(x==-1)
			{
				
				//if index reached last element return 0.
				return 0;
			}
		//if index x not reached add a value at index x.
			else
			{
				//Decrease array length to control stack overflow.
				return sumArray(arr, x-1)+arr[x];
				
				//Continue the above logic until index value reaches -1. 
			}
			
		}


}
