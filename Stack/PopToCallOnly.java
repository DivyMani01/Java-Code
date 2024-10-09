import java.util.Stack;
public class PopToCallOnly {
  public static void main(String[]args){
    Stack<String> stack= new Stack<String>();
    stack.push("Mincraft");
    stack.push("PUBG");
    stack.push("FFVII");
    stack.push("Free Fire");
    stack.push("Call Duety");
    //this methode is not used becasedis used as pop() removed 
    String myFavGame = stack.pop();
    System.out.println(stack);
    System.out.println(myFavGame);
  }
}
