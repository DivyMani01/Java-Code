import java.util.*;
public class PreIncrement {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x=10;
    int y=0;
    y=++x;
    System.out.println(x);//Value Change ++x :11
    System.out.println(y);//value change y=++x :11
    int a= sc.nextInt();
    int b= sc.nextInt();
    int c= a+b;
    System.out.println(c);
    //PreIncrement used ++c 
    System.out.println(++c);
  }
}