import java.util.*;
public class TwoDArray {
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter rows Value :");
    int rows= sc.nextInt();
    System.out.print("Enter colm Value :");
    int colm=sc.nextInt();
    int [][] num= new int[rows][colm];
    for(int i=0;i <rows; i++){
      for(int j=0; j<colm; j++){
        num[i][j]=sc.nextInt();
      }
    }
    for(int i=0; i<rows; i++){
      for(int j=0;j<colm; j++){
        System.out.print(num[i][j] + " ");
      }
      System.out.println();
    }
   
  }
}
