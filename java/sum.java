import java.util.*;
public class sum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.print("Enter The Digit :");
            int n=sc.nextInt();
            int i=((n+1)*n)/2;
            System.out.println("Sum of Natural Number Is :"+i);
        }
        
    }
}
