package queuesample;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSearchExample {

    public static void main(String[] args) {
        // This program demonstrates searching for an element in a queue

        // Step 1: Create a queue and add elements
        Queue<String> queue = new LinkedList<>();
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");
        queue.add("David");

        System.out.println("Original Queue: " + queue);

        // Step 2: Element to search
        String target = "Charlie";

        // Step 3: Perform linear search
        boolean found = false;
        int size = queue.size(); // remember original size

        for (int i = 0; i < size; i++) {
            String element = queue.poll(); // remove from front
            if (element.equals(target)) {
                found = true;
                System.out.println(target + " found in the queue!");
            }
            queue.add(element); // restore element to the rear
        }

        if (!found) {
            System.out.println(target + " not found in the queue.");
        }

        // Step 4: Display queue after search (queue order preserved)
        System.out.println("Queue after search: " + queue);
    }
}
