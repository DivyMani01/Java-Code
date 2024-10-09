public class MaxMin {
  public static void main(String args[]){
    int Numbers[]={3,5,4,1,8,9};
    for(int i=0; i<6; i++){
      if (1 >= Numbers[i]) {
        System.out.println("Minimum element is :"+Numbers[i]);
      }
      else if (Numbers[i] >= 9) {
        System.out.println("Maximum element is :" +Numbers[i]);
      }
    }
  }
}
