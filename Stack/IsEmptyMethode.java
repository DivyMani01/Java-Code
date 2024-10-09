import java.util.*;
public class IsEmptyMethode {
  public static void main(String[] args){
    Queue <String>queue =new LinkedList<String>();
    System.out.println(queue.isEmpty());
    queue.offer("hp");
    queue.offer("Lenevo");
    queue.offer("Dell");
    System.out.println(queue.isEmpty());
    System.out.println(queue.contains("Lenevo"));
    System.out.println(queue.size());
  }
}
