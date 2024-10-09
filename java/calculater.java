import java.util.*;
public class calculater {
   public static void main(String[] args){
    while (true) {
        Scanner sc=new Scanner(System.in);
        System.out.println("******CALCULATER******");
        System.out.print("Addition Please Enter 1\nSubstraction Please Enter 2\nMultiblication Please Enter 3\nDivision Please Enter 4 \nOdd and Even Number Cheak Please Enter 5 :\nPlease Enter the Value : ");
        int button=sc.nextInt();
        switch (button) {
            case 1:
                System.out.print("Please Enter 1st Digit :");
                int a=sc.nextInt();
                System.out.print("Please Enter 2nd Digit :");
                int b=sc.nextInt();
                int c=a+b;
                System.out.println("Addition Value is :"+c);
            break;
            case 2:
                System.out.print("Please Enter 1st Digit :");
                int d=sc.nextInt();
                System.out.print("Please Enter 2nd Digit :");
                int e=sc.nextInt();
                int f=d-e;
                System.out.println("Substraction Value is :"+f);
            break;
            case 3:
                System.out.print("Please Enter 1st Digit :");
                int g=sc.nextInt();
                System.out.print("Please Enter 2nd Digit :");
                int h=sc.nextInt();
                int i=g*h;
                System.out.println("Multiplicaion Value is :"+i);
            break;
            case 4:
                System.out.print("Please Enter 1st Digit :");
                int j=sc.nextInt();
                System.out.print("Please Enter 2nd Digit :");
                int k=sc.nextInt();
                int l=j/k;
                System.out.println("Division Value is :"+l);  
            break;
            case 5:
                System.out.print("Please Enter a Number :");
                int value=sc.nextInt();
                if (value%2==0) {
                    System.out.println("This is a Even Number :"+value);
                }else{
                    System.out.println("This is a Odd Number :"+value);
                }
            break;
            default:
                System.out.println("*******Enter Invalid Button Please Enter Right Button*******");
            break;
        }
    }
   } 
}
