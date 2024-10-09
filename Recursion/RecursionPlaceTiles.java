import java.util.Scanner;

public class RecursionPlaceTiles {
  public static int PlaceTiles(int n, int m){
    if (n == m) {
      return 2;
    }
    if (n < m) {
      return 1;
    }
    //Vertically PlaceTiles :
    int Vertically=PlaceTiles(n-m,m);

    //Horizantal PlaceTiles :

    int Horizantal= PlaceTiles(n-1, m);

    return Vertically + Horizantal ;
  }
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("N Area is :");
    int n=sc.nextInt();
    System.out.print("M Area is :");
    int m=sc.nextInt();
    System.out.println(PlaceTiles(n, m));
  }
}
