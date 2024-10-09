import java.util.*;
public class Break {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int value=sc.nextInt();
        switch (value) {
            case 1:
                System.out.println("Hellow");
                break;
            case 2:
                System.out.println("Namste");
                break;
            case 3:
                System.out.println("Banjour");
                break;
        
            default:
                System.out.println("You Inter inviliad Value");
                break;
        }
    }
}
