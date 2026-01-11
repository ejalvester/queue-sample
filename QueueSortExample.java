package queuesample;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSortExample {
	  // This method sorts a queue in ascending order using a temporary queue
    public static Queue<Integer> sortQueue(Queue<Integer> inputQueue) {
        Queue<Integer> sortedQueue = new LinkedList<>();

        while (!inputQueue.isEmpty()) {
            int current = inputQueue.poll(); // remove front element from input
            // Insert current element into sortedQueue in sorted order
            int size = sortedQueue.size();
            int count = 0;

            // Move elements larger than current back to inputQueue temporarily
            while (count < size) {
                int temp = sortedQueue.poll();
                if (temp > current) {
                    inputQueue.add(temp);
                } else {
                    sortedQueue.add(temp);
                }
                count++;
            }
            // Add the current element to the sortedQueue
            sortedQueue.add(current);
        }
        return sortedQueue;
    }

    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        numbers.add(40);

        System.out.println("Original Queue: " + numbers);

        Queue<Integer> sorted = sortQueue(numbers);

        System.out.println("Sorted Queue: " + sorted);
    }
}