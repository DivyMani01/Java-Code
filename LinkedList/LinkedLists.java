import java.util.*;
public class LinkedLists{
  public static void main(String[] args){
    LinkedList<String>Linkedlist =new LinkedList<String>();
    Linkedlist.push("A");
    Linkedlist.push("M");
    Linkedlist.push("G");
    Linkedlist.push("S");
    Linkedlist.push("K");
    Linkedlist.push("L");
    //removed used pop() methode
    Linkedlist.pop();
    System.out.println(Linkedlist);
    // used offer and poll mathode in linkedlists
    LinkedList<String>LinkedListnam = new LinkedList<String>();
    LinkedListnam.offer("A");
    LinkedListnam.offer("B");
    LinkedListnam.offer("C");
    LinkedListnam.offer("D");
    LinkedListnam.offer("E");
    LinkedListnam.offer("F");
    LinkedListnam.offer("G");
    LinkedListnam.poll();
    System.out.println(LinkedListnam);
  }
}