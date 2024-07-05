package datastructures.queue;

public class Main {
    public static void main(String[] args) {

        Queue myQueue = new Queue(4);
        //myQueue.getFirst();
        //myQueue.getLast();
        //myQueue.getLength();

        myQueue.enqueue(5);

        myQueue.dequeue();
        myQueue.printQueue();
    }
    
}
