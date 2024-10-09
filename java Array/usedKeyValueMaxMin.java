import java.util.*;

public class usedKeyValueMaxMin {
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.print("Inter the Element :");
    int size= sc.nextInt();
    int Numbers[]=new int[size];
    for(int i=0; i<size; i++){
      Numbers[i]= sc.nextInt();
    }
    int max= Integer.MAX_VALUE;
    int min=Integer.MIN_VALUE;
    for(int i=0;i <Numbers.length;i++){
      if (Numbers[i]<min) {
        min=Numbers[i];
       // System.out.println("Maximum number is :"+Numbers[i]);
      }
      else if(Numbers[i] > max){
        max=Numbers[i];
       // System.out.println("Minimum number is :"+Numbers[i]);
      }
    }
    System.out.println("Maximum number is :"+max);
    System.out.println("Minimum number is :"+min);
  }
  
}
