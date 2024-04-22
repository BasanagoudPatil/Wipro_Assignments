package Day_1to3;

public class Task5 {
	public static void main(String[] args) {
		
		//Declare array with values(12,34,32,40,60,11).
			int[] arr= {12,34,32,40,60,11};
			
		//Declare one variable and put one target value.	
			int sum_value=100;
			
		//Initialize found as false boolean value.	
			boolean found=false;
			
		//Created nested for loop i start from 0 and j start from i+1.	
			for(int i=0;i<arr.length;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					
	    //Calculate sum of arr[i] and arr[j] value and store in x variable.		
					int x=arr[i]+arr[j];
					
		//Check x value is equal to target target value.		
					if(x==sum_value)
					{
				
				//Set found as true boolean value.
					    found=true;
					    
					 //Exit loop   
					    break;
					}
				}
			}
			
		//if found is true print found statement.	
			if(found)
			{
				System.out.println("Found");
			}
			
		//if found is false print Not found statement.	
			else
			{
				System.out.println("Not found");
			}

		}

}
