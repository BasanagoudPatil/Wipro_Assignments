package Day_1to3;

public class Task7_b {
	public static void main(String[] args) {
		
		//Initialize an array with elements.	
			int[] arr= {1,4,3,2,7,6,9};
			
		//Create an array variable to store searching value.	
	        int key=6;
	        System.out.println("Searching element: "+key);
	    //call search function to know key element found or not.    
	        Boolean found=search(arr,key);
	        
	     //If key found print key found statement.
	        if(found) {
	        	System.out.println("\n"+key+" found in array");
	        }
	        
	     //else print -1.   
	        else
	        {
	        	System.out.println(-1);
	        }
		}
		static boolean search(int[] arr,int key)
		{
			
		//Initialize variable to store a default false boolean value.	
			boolean b=false;
			
		//creating loop to search value.	
			for(int i=0;i<arr.length;i++)
			{
				
			//Check array value matches key value.	
				if(arr[i]==key)
				{
				
				//if values matches convert boolean value as true.
					b=true;
				}
			}
			
		//Return boolean value.	
			return b;
		}


}
