public class printMinAndMax8{
    public static int printMax(int arr[]){
       int n = arr.length;
       int max = Integer.MIN_VALUE;

       for(int i = 0; i< n; i++){
         if(arr[i] > max){
            max = arr[i];
         }
       }
       return max;   
    }
    public static int printMin(int arr[]){
        int n = arr.length;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i< n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
         return min;
    }
      public static void main(String[] args) {
          int arr[] = {4,5,7,2,3,10,0};
          System.out.println("Max element is : "+ printMax(arr));
          System.out.print("Min element is : "+ printMin(arr));
      }
   }