package Day_1to3;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an integer:");
	  //Take a input value from a user.
	    int number = sc.nextInt();
	    
	  //Initialize variable to count 0 factor numbers.
        int count=0;
        
      //Iterate from 1 to input number.  
	    for(int i=1;i<=number;i++)
	    {
	    	
	    //Check number module i is equal to 0.
	    	if(number%i==0)
	    	{
	    	//if condition pass increment count value.
	    	    count++;
	    	}
	    }
	  /*check count value is equal to 2 because a 
	   * prime number is completely divisible by only 2 values
	   * 1 and them self only*/
	    if(count==2)
	    {
	    //if condition pass print a number is prime.
	    	System.out.println(number+" is prime number");
	    }
	    else
	    {
	    //if condition fail print a number is not prime.
	    	System.out.println(number+" is not prime number");
	    }

	}

}
