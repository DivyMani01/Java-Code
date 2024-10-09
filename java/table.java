import java.util.*;
public class table {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Table :");
        int n=sc.nextInt();
        int sum=1;
        for(int i=1;i<=10;i++){
           sum=n*i;
           System.out.println(sum);
        }
        
    }
}
