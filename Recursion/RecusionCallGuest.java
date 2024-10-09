import java.util.*;
public class RecusionCallGuest {
  public static int callGuest(int n){
    // Only one Guest 
    if (n <= 1) {
      return 1;
    }
    int ways1= callGuest(n-1);
    int ways2= (n-1) * callGuest(n-2);
    return ways1 + ways2 ;
  }
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Total CallGuest is :");
    int n = sc.nextInt();
    System.out.println("Total Ways in :" +callGuest(n));
  }
}
