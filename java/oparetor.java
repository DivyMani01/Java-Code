import java.util.*;
public class oparetor {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if (a>b) {
            System.out.println("a is greater then b :"+a);
        }
        else if(a<b){
            System.out.println("a is lessthen b "+a);
        }
        else if (a==b){
            System.out.println("a is equal to b"+a);
        }
        else{
            System.out.println("Value is :"+a);
        }
    }
}
