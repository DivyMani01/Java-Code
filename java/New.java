import java.util.*;
public class New{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b){
            System.out.println("A is Equal to B "+a);
        }else{
            if (a>b){
                System.out.println(" A is Greater then B "+a);
            }else{
                
                System.out.println(" A is lessthen B "+b);
            }
        }
    }
}
