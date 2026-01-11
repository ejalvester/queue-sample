package queuesample;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMergeExample {

    public static void main(String[] args) {
        // This program demonstrates merging two queues into a third queue

        // Step 1: Create two queues
        Queue<String> queue1 = new LinkedList<>();
        Queue<String> queue2 = new LinkedList<>();

        // Step 2: Add elements to queue1
        queue1.add("Alice");
        queue1.add("Charlie");
        queue1.add("Eve");

        // Step 3: Add elements to queue2
        queue2.add("Bob");
        queue2.add("David");
        queue2.add("Frank");

        System.out.println("Queue 1: " + queue1);
        System.out.println("Queue 2: " + queue2);

        // Step 4: Merge queues into a third queue
        Queue<String> mergedQueue = new LinkedList<>();

        // Dequeue from queue1 and add to mergedQueue
        while (!queue1.isEmpty()) {
            mergedQueue.add(queue1.poll());
        }

        // Dequeue from queue2 and add to mergedQueue
        while (!queue2.isEmpty()) {
            mergedQueue.add(queue2.poll());
        }

        // Step 5: Display the merged queue
        System.out.println("Merged Queue: " + mergedQueue);
    }
}