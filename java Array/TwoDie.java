import java.util.*;
public class TwoDie {
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int rows = sc.nextInt();
    int col = sc.nextInt();
    int [][] num=new int[rows][col];
    for(int i=0; i < rows; i++){
      for(int j=0; j < col; j++){
        num [i][j] = sc.nextInt();
      }
    }
    int x = sc.nextInt();
    for(int i=0; i<rows; i++){
      for(int j=0; j<col; j++){
        if (num [i][j] == x) {
          System.out.println("Found x value is :"+num[i][j]);
        }
      }
    } 
  }
}
