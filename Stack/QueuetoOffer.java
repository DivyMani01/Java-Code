import java.util.Queue;
import java.util.LinkedList;
public class QueuetoOffer {
  public static void main(String [] args){
    //****************************************************************
    
    // Queue = FIFO data structure. First-IN First-OUT
    //         A Collection designed for holding elements prior to processing
    //         Linear Data Structure
    // 
    //         add = enqueue , offer()
    //         removed = dequeue, poll()
    //
    //****************************************************************
    //Queue<Datatype> variable name = new LinkedList <Datatype>();
    Queue <String> queue = new LinkedList <String> ();
    queue.offer("Ram");
    queue.offer("Mohan");
    queue.offer("Sohan");
    queue.offer("Kohan");
    System.out.println(queue);


  }
}
