package Day_4to5;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Task4_a {
	List<Integer> stack;

    // Constructor to initialize the stack
    public Task4_a()
    {
        stack=new ArrayList<>();
    }

    // Push operation to add an element to the top of the stack
    public void push(int item)
    {
        stack.add(item);
    }

    // Pop operation to remove and return the top element of the stack
    public int pop()
    {
        if (isEmpty()) 
        {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size()-1);
    }

    // Peek operation to return the top element of the stack without removing it
    public int peek() 
    {
        if (isEmpty()) 
        {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }

    // Check if the stack is empty
    public boolean isEmpty() 
    {
        return stack.isEmpty();
    }

    public static void main(String[] args) 
    {
    	Task4_a stack=new Task4_a();

        // Push integers onto the stack
        stack.push(5);
        stack.push(10);
        stack.push(15);

        // Pop and display elements until the stack is empty
        while(!stack.isEmpty()) {
            System.out.println("Popped: "+stack.pop());
        }
    }

}
