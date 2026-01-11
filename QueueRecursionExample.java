package queuesample;

import java.util.LinkedList;
import java.util.Queue;

public class QueueRecursionExample {

    // This method reverses a queue using recursion
    public static void reverseQueue(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            return; // base case: empty queue is already reversed
        }

        // Step 1: Remove front element
        int front = queue.poll();

        // Step 2: Recursively reverse the remaining queue
        reverseQueue(queue);

        // Step 3: Add the front element to the rear (effectively reversing)
        queue.add(front);
    }

    public static void main(String[] args) {
        // Step 1: Create a queue
        Queue<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Original Queue: " + numbers);

        // Step 2: Reverse the queue using recursion
        reverseQueue(numbers);

        // Step 3: Display the reversed queue
        System.out.println("Reversed Queue: " + numbers);
    }
}
