import java.util.*;
public class arraym {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    System.out.print("Enter occurs number: ");
    int x=sc.nextInt();
    int marks[]=new int[size];
    for(int i=0;i<size;i++){
      marks[i]=sc.nextInt();
    }
   /**  for(int i=0;i<size;i++){
      System.out.println(marks[i]);
    }**/
      if (size==x) {
      System.out.println(size);
    }

  }
}
