import java.util.*;
public class methodeused {
  public static void main(String[] args){
    LinkedList<String> linkedlist = new LinkedList<String>();
    linkedlist.offer("A");
    linkedlist.offer("B");
    linkedlist.offer("C");
    linkedlist.offer("D");
    linkedlist.offer("E");
    //used peek fist element then used peekFirst()

    System.out.println(linkedlist.peekFirst());

    //used peek last element then used peekLast()

    System.out.println(linkedlist.peekLast());

    //used Add first element then used addFirst()

    linkedlist.addFirst("5");

    //used Add first element then used addFirst()
    linkedlist.addLast("8");

    System.out.println(linkedlist);

    //used removed first element then used removeFirst()
    linkedlist.removeFirst();

    //used removed first element then used removeFirst()
    linkedlist.removeLast();

    
    System.out.println(linkedlist);
    


  }
}
