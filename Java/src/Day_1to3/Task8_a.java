package Day_1to3;

import java.util.Arrays;



public class Task8_a {
	public static void main(String[] args) {
		
		//Initialize array with array elements.	
			int[] arr= {1,2,3,4,5,6,7};
			
			System.out.println("Array values");
			System.out.println(Arrays.toString(arr));

			
		//Store a starting index and end index values in variable.	
			int start=3;
			int end=5;
			
			System.out.println("\nStart from: "+start);
			System.out.println("End at: "+end);
			
		//Calling slice array function to print print updated array values.	
			System.out.println("\nArray values from start to end");
			System.out.println(Arrays.toString(sliceArraya(arr,start,end)));

		}
		static int[] sliceArraya(int[] arr,int start,int end)
		{
			
		/*Create one new slice array to store values present from
		 * start and end index in between*/ 	
			int[] slice=new int[end-start+1];
			
		//Create loop to pass value to arr array to slice array.	
			for(int i=0;i<slice.length;i++)
			{
			
			//Store a values in slice array.	
				slice[i]=arr[start+i-1];
			}
			
		//return updated slice array.	
			return slice;
			
		}


}
