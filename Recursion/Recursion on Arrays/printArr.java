public class printArr{
    public static void printArray(int arr[] , int idx){
      if(idx== arr.length){
        return ;
      }

      System.out.print(arr[idx]+" ");
      printArray(arr, idx+1);
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,6,9,1,5};
        printArray(arr, 0);
    }
}