import java.util.Queue;
import java.util.LinkedList;
public class PeekandPoll {
  public static void main(String[] args){
    Queue <String> queue = new LinkedList<String>();
    queue.offer("MacBook");
    queue.offer("HP");
    queue.offer("Dell");
    queue.offer("Lenavo");
    queue.offer("Azue");
    queue.poll();
    System.out.println(queue);
    
  }
}
