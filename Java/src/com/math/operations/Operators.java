package com.math.operations;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=5;
		Addition ad=new Addition();
		System.out.println("Addition: "+ad.add(a,b));
		
		Substraction sb=new Substraction();
		System.out.println("Substraction: "+sb.sub(a,b));
		
		Multiplication mu=new Multiplication();
		System.out.println("Multiplication: "+mu.mul(a,b));
		
		Division di=new Division();
		System.out.println("Division: "+di.div(a,b));

		

	}

}
