package queuesample;

import java.util.LinkedList;
import java.util.Queue;

public class QueueAddDeleteExample {

    public static void main(String[] args) {
        // This program demonstrates basic add (enqueue) and delete (dequeue) operations on a queue

        // Step 1: Create a queue
        Queue<String> line = new LinkedList<>();

        // Step 2: Add elements to the queue (enqueue)
        line.add("Alice");
        line.add("Bob");
        line.add("Charlie");
        System.out.println("Queue after adding people: " + line);

        // Step 3: Remove the first element (dequeue)
        String firstPerson = line.poll(); // removes front of the queue
        System.out.println(firstPerson + " has been served and removed from the queue.");
        System.out.println("Queue now: " + line);

        // Step 4: Peek at the front of the queue without removing
        String nextPerson = line.peek();
        System.out.println("Next person to be served: " + nextPerson);

        // Step 5: Add another person to the queue
        line.add("David");
        System.out.println("Queue after adding David: " + line);

        // Step 6: Remove all elements one by one
        while (!line.isEmpty()) {
            System.out.println(line.poll() + " has been served and removed.");
        }
        System.out.println("Queue is now empty: " + line);
    }
}