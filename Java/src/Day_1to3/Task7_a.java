package Day_1to3;

import java.util.Arrays;

public class Task7_a {
	public static void main(String[] args) {
		
		//Initialize a array with array elements.	
			int[] arr= {1,5,4,3,0,90,12};
			
		//Print unsorted array.	
		    System.out.println("Unsorted array");
			System.out.println(Arrays.toString(arr));
			
		//print sorted array by calling sort function.	
			System.out.println("\nSorted array");
			System.out.println(Arrays.toString(sort(arr)));

		}
		
		static int[] sort(int arr[])
		{
		
		//Created outer loop for traversing the array.	
			for(int i=0;i<arr.length-2;i++)
			{
			//Inner loop for comparing and swap array values.	
				for(int j=0;j<arr.length-1-i;j++)
				{
				/*Compare adjacent array element to check array
					values are in correct order not.*/	
					if(arr[j]>arr[j+1])
					{
					//If they are in incorrect order sway those values.	
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
			
		//Return sorted array.
			return arr;
		}


}
