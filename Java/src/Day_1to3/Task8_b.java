package Day_1to3;

import java.util.Arrays;

public class Task8_b {
	public static void main(String[] args) {
		
		//Initialize a variable to store a range of the fibonacci range.	
	      int x=10;
	      
	    //call fibonacci to print nth fibonacci number.
	      System.out.println(x+"th fibonacci number: ");
	      System.out.println(fibonacci(x));
	      
	    //call fibonacciArray to print all the fibonacci numbers.  
	      System.out.println("\nFirst "+x+" fibonacci numbers: ");
	      System.out.println(Arrays.toString(fibonacciArray(x)));

		}
		static int fibonacci(int x)
		{
		//Check x reaches 1.
			if(x<=1)
			{
			//if x reaches 1 return x.	
				return x;
			}
		//if condition fails return fibonacci number.	
			else
			{
			return fibonacci(x-1)+fibonacci(x-2);
			}
		}
		static int[] fibonacciArray(int x)
		{
			
		//Create an array to store a fibonacci numbers.	
			int[] fib=new int[x+1];
			
		//create an loop to enter values to array.	
			for(int i=0;i<=x;i++)
			{
				fib[i]=fibonacci(i);
			}
			
		//Return fib array.	
			return fib;
			
		}


}
