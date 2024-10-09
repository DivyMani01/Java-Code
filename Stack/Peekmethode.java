import java.util.Stack;
public class Peekmethode {
  public static void main(String[]args){
    Stack <String> stack = new Stack<String>();
    stack.push("Iphone");
    stack.push("Vivo");
    stack.push("Sumsung");
    stack.push("Google Phone");
    stack.push("One Plus");
    //peek() methode is use to Slected special data.
    System.out.println(stack.peek());
    System.out.println(stack);
  }
}
