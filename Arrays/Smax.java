//WAP To print the second maximum element in the array
public class Smax{
    public static void main(String[] args){
       int[] arr = {3 , 5, 7, 8, 21, 89};
       int max = Integer.MIN_VALUE;
       int Smax = Integer.MIN_VALUE;
       int n = arr.length;

       for(int i = 0; i<n; i++){
        if(arr[i] > max){
            max = arr[i];
        }
    
       }
       System.out.println("Maximum element from array are  : " + max);
       for(int i = 0;i < n;i++){
        if(arr[i] > Smax  && arr[i] != max){
            Smax = arr[i];
        }
       }
       System.out.print("Second maximum element in array are :" + Smax);
    }
}