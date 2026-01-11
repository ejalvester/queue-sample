package queuesample;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		// Create a Queue
		Queue<String> busQueue = new LinkedList<>();
		
		 // Enqueue (add people to the queue)
		  busQueue.add("Alice");
		  busQueue.add("Bob");
		  busQueue.add("Charlie");
		  
		  System.out.println("People in line: " + busQueue);
		
		// Dequeue (remove the first person)
	        String firstPerson = busQueue.poll();
	        System.out.println(firstPerson + " got on the bus.");

	        System.out.println("People still in line: " + busQueue);

	        // Peek (check who is next)
	        System.out.println("Next person in line: " + busQueue.peek());
		 
	}

}
