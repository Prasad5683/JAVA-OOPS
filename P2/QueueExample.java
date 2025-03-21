import java.util.LinkedList;
import java.util.Queue;

class 
{
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        
        // Enqueue elements into the queue
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        
        // Printing the queue
        System.out.println("Queue: " + queue);
        
        // Dequeue elements from the queue
        System.out.println("Dequeued from queue: " + queue.remove());
        System.out.println("Queue after dequeue: " + queue);
        
        // Peeking the front element
        System.out.println("Front element of the queue: " + queue.peek());
    }
}
