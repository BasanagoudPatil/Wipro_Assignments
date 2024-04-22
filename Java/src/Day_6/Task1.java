package Day_6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1 {
	public static void remove(List<Integer> list) {
        Iterator<Integer> list2=list.iterator();
        int index=1;
      //Use while to check when list reaches last value.  
        while (list2.hasNext()) {
            list2.next();
          //remove 2nd element.  
            if (index%2==0) {
                list2.remove();
            }
            //Increment index value.
            index++;
        }
    }

    public static void main(String[] args) {
        // Create a mutable list using ArrayList and add elements to it
        List<Integer> list=new ArrayList<>();
        for (int i=0;i<=10;i++) {
            list.add(i);
        }
        System.out.println("Original List: "+list);

        remove(list);
        System.out.println("\nList after removing every second element: "+list);
    }

}
