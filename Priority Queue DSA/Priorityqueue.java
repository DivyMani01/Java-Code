import java.util.*;
public class Priorityqueue{
  public static void main(String[] args){
    Queue <Double> queue = new PriorityQueue<>();
    //PriorityQueue to get assanding other like 1.5,3.5,4.0,5.5
    //LinkedList get out put 4.0,5.5,3.5,1.5
    queue.offer(4.0);
    queue.offer(5.5);
    queue.offer(3.5);
    queue.offer(1.5);
    while (!queue.isEmpty()) {
      System.out.println(queue.poll());
    }
  }
}