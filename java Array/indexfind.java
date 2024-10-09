import java.util.*;
public class indexfind {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Rows Value :");
    int rows = sc.nextInt();
    System.out.print("Enter Column Value :");
    int col = sc.nextInt();
    int [] [] num= new int[rows][col];
    for(int i=0; i < rows; i++){
      for(int j=0; j < col; j++){
        num[i][j] = sc.nextInt();
      }
    }
    System.out.print("Please Enter X Value :");
    int x=sc.nextInt();
    for(int i=0; i< rows;i++){
      for(int j=0; j<col;j++){
        if (num[i][j] == x) {
          System.out.println("X Index is :("+i + " ,"+j+")");
        }
      }
    }
  }
}
