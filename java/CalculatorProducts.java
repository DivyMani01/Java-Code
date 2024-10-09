import java.util.*;
public class CalculatorProducts {
    public static int CalcultorProduct(int a,int b){
        return a*b;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("First Products of Number is :");
        int a =sc.nextInt();
        System.out.print("Second Products of Number is :");
        int b=sc.nextInt();
        System.out.println("Products of two Number is :"+CalcultorProduct(a, b));
    }
}
