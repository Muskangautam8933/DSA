//For an array 'a' sorted in non-decreasing order, return an array of squares of each number sorted in non-decreasing order
public class square{

    public static int[] squareArr(int arr[]){
       int n = arr.length;
       int ans[] = new int[n];
       int k = 0;
       int left = 0 , right = n - 1;

       while(left <= right){
        if(Math.abs(arr[left]) > Math.abs(arr[right])){
            ans[k] = arr[left] * arr[left];
            k++;
            left++;
        }else{
            ans[k] = arr[right] * arr[right];
            k++;
            right--;
        }
       }    
    return ans;
    }
    public static void main(String[] args) {
        int arr[] = {-10 , -1 , 2 , 20};
        int result[] = squareArr(arr);
        int n = arr.length;

        System.out.print("Square of each element are : ");
        for(int i = 0; i< n; i++){
           System.out.print(result[i]+" ");
        }

    }
}