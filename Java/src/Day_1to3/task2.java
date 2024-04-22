package Day_1to3;

import java.util.Scanner;

public class task2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num1=sc.nextInt();
		System.out.println("Enter oprator(+,-,*,/):");
		String operator=sc.next();
		System.out.println("Enter number:");
		int num2=sc.nextInt();
		
	//Initialize a result variable to store result.	
		double Result=0;
		
	//Use switch condition to check operator to task.	
		switch(operator) {
		case "+":
			Result=num1+num2;
			System.out.println(Result);
			break;
		case "-":
			Result=num1-num2;
			System.out.println(Result);
			break;
		case "*":
			Result=num1*num2;
			System.out.println(Result);
			break;
		case "/":
			if(num2==0)
				System.out.println("Invalid values");
			else 
			{
			    Result=num1/num2;
			    System.out.println((double)Result);
			}
			break;
			
	//If operator not found print invalid operator.		
		default:
			System.out.println("Invalid operator");

		}
		

	}
}
