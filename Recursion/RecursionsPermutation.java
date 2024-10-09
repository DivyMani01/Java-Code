import java.util.Scanner;

public class RecursionsPermutation{
  public static void PrintPerm(String str, String permutation){
    if (str.length() == 0) {
      System.out.println(permutation);
      return;
    }
    for(int i=0; i<str.length();i++){
      char curreChar = str.charAt(i);

      //"abc" -> "ab"

      String newStr = str.substring(0, i) + str.substring(1+i);
      PrintPerm(newStr,permutation+curreChar);
    }
  }
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Inter String is :");
    String str = sc.nextLine();
    PrintPerm(str," ");
  }

}