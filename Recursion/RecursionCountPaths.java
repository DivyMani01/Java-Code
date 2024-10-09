import java.util.Scanner;

public class RecursionCountPaths {
  public static int countPaths(int i, int j, int n, int m){
    if (i == n || j == m ) {
      return 0;
    }
    if (i == n-1 && j == m-1) {
      return 1;
    }
    //Move Downword
    int downpaths = countPaths(i+1, j, n, m);
    //Move rightside
    int rightpaths= countPaths(i, j+1, n, m);

    return downpaths + rightpaths;
  }
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the n :");
    int n = sc.nextInt();
    System.out.print("Enter the m :");
    int m = sc.nextInt();
    int totalParths = countPaths(0, 0, n, m);
    System.out.println(totalParths);
  }
}
