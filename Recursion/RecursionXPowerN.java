public class RecursionXPowerN{
  public static int CalcPower(int x, int n){
    if (n == 0) {
      return 1; //Base Case 1
    }
    if (x == 0) {
      return 0;//Base Case 2
    }
    //Work
    int XPown=CalcPower(x, n-1);
    int XPownN = x * XPown;
    return XPownN;
  }
  public static void main(String []args){
    int x=2,n=5;
    int ans=CalcPower(x, n);
    System.out.print("X Power n is :"+ans);
  }
}