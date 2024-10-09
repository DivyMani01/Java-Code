import java.util.*;
public class RecursionSubsetNaturalNumber {
  public static void PrintSubset(ArrayList <Integer> subset){
    for(int i=-0; i<subset.size(); i++){
      System.out.print(subset.get(i) +" ");
    }
    System.out.println();
  }
  public static void FindSubset(int n, ArrayList <Integer> subset){
    if (n == 0) {
      PrintSubset(subset);
      return ;
    }
    //add
    subset.add(n);
    FindSubset(n-1, subset);
     // not add
    subset.remove(subset.size()-1);
    FindSubset(n-1, subset);
  }
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Please Enter Natural Numbers :");
    int n = sc.nextInt();
    ArrayList <Integer> subset = new ArrayList<>();
    FindSubset(n, subset);
  }
}
