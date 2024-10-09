import java.util.Stack;
public class PoptoRemovePushData {
  public static void main(String[] args){
    Stack<String> stack = new Stack<String>();
    stack.push("Mincraft");
    stack.push("Pubg");
    stack.push("FFVII");
    stack.push("Free Fire");
    stack.push("Call Duety");
    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();
    System.out.println(stack);
  }
}
