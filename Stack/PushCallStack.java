import java.util.Stack;
public class PushCallStack {
  public static void main(String[] args){

    //************************************************************
    //
    //  Stack = LIFO data Structure. Last-IN  First-OUT
    //          stores ibjects into a sort of "vertical tower"
    //          push() to add to the top 
    //          pop() to remove from the top
    //
    //************************************************************
    

    Stack<String> stack = new Stack<String>();
    stack.push("Mincraft");
    stack.push("Pubg");
    stack.push("FFVII");
    stack.push("Free Fire");
    stack.push("Call Duety");
    System.out.println(stack);
  }
}
