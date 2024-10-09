import java.util.*;
public class Multiply {
    public static int mulPly(int a,int b){
        int mul=a*b;
        return mul;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        int mul=mulPly(a, b);
        System.out.println("Multiplication is :"+mul);
    }
}
