package Day_1to3;

public class Task1 {

	public static void main(String[] args) {
		//Declares two integer variables.
		int value1=20;
		int value2=10;
		System.out.println("value1: "+value1+"\n"+"value2: "+value2);
	
		//Add value1 and value2 the then store result value in value1.
		value1=value1+value2;
	
		//Subtract value2 from new value1 then store result int value2.
		value2=value1 - value2;
		
		//Subtract new value2 from new value2 then store result in value1.
		value1=value1 - value2;
		
		System.out.println("\nSwaped values");
		System.out.println("value1: "+value1+"\n"+"value2: "+value2);

	}
}
