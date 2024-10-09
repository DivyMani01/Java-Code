import java.util.*;
public class Gree {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 1 Hello \nEnter 2 Namste \nEnter 3 Banjour");
    int n=sc.nextInt();
    if(n==1){
        System.out.println("Hellow");
    }else if (n==2) {
        System.out.println("Namste");
    }else if (n==3) {
        System.out.println("Banjour");
    }else{
        System.out.println("***You Enter Wrong Key*** \n Please Enter Right Key :");
    }
}
}
