import java.util.Scanner;

public class RecursionFactorial {
  public static int CalcFactorial(int n){
    //Base Case :

    if (n == 0 || n == 1) {
      return 1;
    }
    //Calcutate Factorial Number :
    int fact=CalcFactorial(n-1);
    int fact_n = n*fact;
    return fact_n;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //Main Fuction :
    System.out.print("Enter Your Number :");
    int n= sc.nextInt();
    int result = CalcFactorial(n);
    System.out.println("Factorial is :"+result);
  }
}
