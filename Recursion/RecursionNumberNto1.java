import java.util.Scanner;

public class RecursionNumberNto1 {
  public static void PrintNumber(int n){
    if (n == 0) {
      return;
    }
    System.out.println(n);
    PrintNumber(n-1);
  }
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    PrintNumber(n);
  }
}
