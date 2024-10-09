import java.util.*;
public class age {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int ag=sc.nextInt();
        if(ag>18){
            System.out.println("Adult");
        }else{
            System.out.println("Not Adult");
        }
    }
}
