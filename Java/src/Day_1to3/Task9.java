package Day_1to3;

public class Task9 {
	public static void main(String[] args) {
	     //Take a two string variable.
	        String string1="Hello";
	        String string2="java";
	     //Take mid length of a string.   
	        int length=4;
	        System.out.println("string 1:"+string1);
	        System.out.println("string 2:"+string2);
	        System.out.println("Length :"+length);

	        
	     //call a MiddleSubstring
	        String midString=MiddleSubstring(string1, string2, length);
	        System.out.println("\nMiddle Substring: "+midString);
	    }
   public static String MiddleSubstring(String string1, String string2, int length) {
   	
    // Combine the strings
       String concatenated=string1+string2;
      
    //Create a variable to store reversed string.   
       String reversed="";
       
    //Reverse the combined string
       for (int i=0;i<concatenated.length();i++) {
       	  reversed=concatenated.charAt(i)+reversed;
       	}

    //Calculate the start index of the middle substring
       int startIndex=(reversed.length()-length)/2;
       
    //create variable to store mid string values.   
       String midarray="";
       
    //create a loop to get mid value.   
       for(int i=startIndex;i<startIndex+length;i++) {
       	midarray=midarray+reversed.charAt(i);
       }
    
   //return midarray.
       return midarray;

   }

}
