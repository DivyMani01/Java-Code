import java.util.Stack;

public class StackSearch {
  public static void main(String[] args){
    Stack <String> stack =new Stack <String> ();
    //System.out.print(" Top MNC Company is :");
    stack.push("Apple");
    stack.push("Google");
    stack.push("Microsoft");
    stack.push("IBM");
    stack.push("Amazon");
    stack.push("TCS");
    System.out.println(stack.search("Google"));//last 1,2,3,4,5 Google
    //System.out.println(stack.peek());
    System.out.println(stack);
  }  
}
