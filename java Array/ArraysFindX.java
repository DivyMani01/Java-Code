import java.util.*;
public class ArraysFindX {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num=sc.nextInt();
    int ArraysNum[]= new int[num];
    for(int i=0;i <num; i++){
      ArraysNum[i]=sc.nextInt();
    }
    System.out.print(" Enter X Value :");
    int x=sc.nextInt();
    for(int i=0;i < ArraysNum.length;i++){
      
     if (ArraysNum[i] == x) {
        System.out.println("X Found at Index :"+ i + "\n the value of :" +ArraysNum[i]);
      }
    }
  }
}
