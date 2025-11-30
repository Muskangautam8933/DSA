public class maxElem{
    public static int max(int arr[] , int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int smallAns = max(arr, idx+1);
        return Math.max(arr[idx] , smallAns);
    }
    public static void main(String[] args) {
        int arr[] = {3,5,8,1,0,9};
       System.out.println( max(arr, 0));
    }

}