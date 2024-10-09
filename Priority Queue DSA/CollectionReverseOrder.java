import java.util.*;
public class CollectionReverseOrder {
  public static void main(String[] args){
    Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
    queue.offer(3.6);
    queue.offer(2.8);
    queue.offer(6.7);
    queue.offer(5.9);
    queue.offer(7.7);
    while (!queue.isEmpty()) {
      System.out.println(queue.poll());
    }
    //String data Type is also reverse Oder used constracter Collections.reverseOder();
    Queue<String> namQueue = new PriorityQueue<>(Collections.reverseOrder());
    namQueue.offer("A");
    namQueue.offer("E");
    namQueue.offer("M");
    namQueue.offer("J");
    namQueue.offer("Z");
    namQueue.offer("B");
    while (!namQueue.isEmpty()) {
      System.out.println(namQueue.poll());
    }
  }
}
