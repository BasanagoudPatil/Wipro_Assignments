package Day1;

public class Task2 {

	public static void main(String[] args){
        int number=5;
        int sum=0;
        //Logical error 
        /* program pauses at the breakpoint,if variable i
        Notice it is decreasing instead of increasing.*/
        for (int i=1;i<=number;i++) 
        { 
            sum+=i;
        }
        System.out.println("Sum of number is: "+sum); 
	}
}
