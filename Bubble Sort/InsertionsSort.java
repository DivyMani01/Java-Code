public class InsertionsSort{
  public static void ArraysSort(int [] array){
    for(int i=0;i<array.length; i++){
      System.out.print(array[i] +" ");
    }
    System.out.println();
  }
  public static void main(String[] args){
    int arr[] = {7,8,3,2,1};
    //Insertion Sort
    for(int i =1; i<arr.length-1; i++){
      int current = arr[i];
      int j=i+1;
      while (j>= 0 && arr[current] < arr[i]) {
        arr[j+1] =arr[j];
        j--;
      }
      arr[j+1] = current;
    }
    ArraysSort(arr);
  }
}