package arraylist.queue;

import arraylist.set.Person;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args){
        PriorityQueue priorityQueue1=new PriorityQueue();
        priorityQueue1.offer(-2);
        priorityQueue1.offer(10);
        priorityQueue1.offer(5);
        priorityQueue1.offer(6);
        priorityQueue1.offer(7);
        priorityQueue1.offer(8);

        System.out.println(priorityQueue1);
        priorityQueue1.poll();
        System.out.println(priorityQueue1);
    }

}
