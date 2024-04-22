package Day_4to5;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Task4_b<T> {
	List<T> queue;

    // Constructor to initialize the queue
    public Task4_b() {
        queue = new ArrayList<>();
    }

    // Enqueue operation to add an element to the end of the queue
    public void enqueue(T item) {
        queue.add(item);
    }

    // Dequeue operation to remove and return the front element of the queue
    public T dequeue() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return queue.remove(0);
    }

    // Peek operation to return the front element of the queue without removing it
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return queue.get(0);
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        // Creating a CustomQueue object for integers
    	Task4_b<Integer> intQueue = new Task4_b<>();
        intQueue.enqueue(5);
        intQueue.enqueue(10);
        intQueue.enqueue(15);

        // Dequeue and display elements to confirm FIFO order
        while (!intQueue.isEmpty()) {
            System.out.println("Dequeued integer: " + intQueue.dequeue());
        }

        // Creating a CustomQueue object for strings
        Task4_b<String> stringQueue = new Task4_b<>();
        stringQueue.enqueue("Hello");
        stringQueue.enqueue("World");
        stringQueue.enqueue("!");

        // Dequeue and display elements to confirm FIFO order
        while (!stringQueue.isEmpty()) {
            System.out.println("Dequeued string: " + stringQueue.dequeue());
        }
    }

}
