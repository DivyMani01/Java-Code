import java.util.*;/**
 * InnerPostIncrement
 */
public class PostIncrement {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a= 10;
    int b=0;
    b=a++;
    //assing the value of a =11

    System.out.println(a);

    //PostIncrement first assing the value a:10 in b =10 then before add a+1=10+1=11 put in a=11 
    //b=10
    System.out.println(b);
    int x= sc.nextInt();
    int y= sc.nextInt();
    int z=x+y;
    //value put x=3 : y=4 , z=7++; 7+1=8
    System.out.println(z++);
    // z=8
    System.out.println(z);
  }
}
