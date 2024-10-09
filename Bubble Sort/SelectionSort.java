public class SelectionSort {
  public static void ArrayPrint(int [] array){
    for(int i=0; i<array.length; i++){
      System.out.print(array[i] +" ");
    }
    System.out.println();
  }
  public static void main(String[] args){
    int[] arr= {1,2,4,6,16,18,3};
    //time completity = O(n^2)
    // Selection sort
    for(int i=0; i<arr.length-1; i++){
      int Smollest = i;
      for(int j=i+1;j<arr.length; j++){
        if (arr[Smollest]>arr[j]) {
          Smollest = j;
        }
      }
      int temp = arr[Smollest];
      arr[Smollest] = arr[i];
      arr[i] =temp;
    }
    ArrayPrint(arr);
  }
}
