import java.util.Stack;
public class PushEmpty{
  public static void main(String[] args){
    Stack <String> stack = new Stack<String>();
    stack.push("Mincraft");
    stack.push("Pubg");
    stack.push("FFVII");
    stack.push("Free Fire");
    stack.push("Call Duety");
    System.out.println(stack.empty());
  }
}