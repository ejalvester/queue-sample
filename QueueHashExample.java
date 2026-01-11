package queuesample;

import java.util.LinkedList;
import java.util.Queue;
import java.util.HashSet;

public class QueueHashExample {

    public static void main(String[] args) {
        // This program demonstrates "hashing" queue elements into a HashSet

        // Step 1: Create a queue
        Queue<String> queue = new LinkedList<>();
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");
        queue.add("Alice"); // duplicate for demonstration

        System.out.println("Original Queue: " + queue);

        // Step 2: Create a HashSet to store unique elements
        HashSet<String> hashSet = new HashSet<>();

        // Step 3: Dequeue elements from queue and put into hashSet
        while (!queue.isEmpty()) {
            String element = queue.poll();
            hashSet.add(element); // HashSet automatically handles duplicates
        }

        // Step 4: Display the hashSet
        System.out.println("Hashed Elements (unique): " + hashSet);

        // Step 5: Check if a particular element exists in the hashSet
        String search = "Bob";
        if (hashSet.contains(search)) {
            System.out.println(search + " exists in the hashed set.");
        } else {
            System.out.println(search + " does NOT exist in the hashed set.");
        }
    }
}