import java.util.*;
public class AddList{
  public static void main(String[] args){
    LinkedList<String> LinkedLists = new LinkedList<String>();
    LinkedLists.offer("A");
    LinkedLists.offer("B");
    LinkedLists.offer("C");
    LinkedLists.offer("D");
    LinkedLists.offer("E");
    LinkedLists.offer("F");
    LinkedLists.offer("G"); 
    //Add element used add() mathode
    LinkedLists.add(4,"HeRo");
    //removed element used removed() mathode
    LinkedLists.remove("HeRo");
    //find index value in Element used indexOf() mathode
    System.out.println(LinkedLists); 
    System.out.println(LinkedLists.indexOf("F")); 
  }
}