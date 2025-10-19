public class firstOccurence{
    public static int first(int arr[] , int target){
        int lo = 0 , hi = arr.length - 1, idx = -1;

        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(arr[mid] > target){
                hi = mid - 1;
            }else if(arr[mid] < target){
                lo = mid + 1; 
            }else{
                idx = mid;
                hi = mid -1;
            }
        }
        return  idx;
    }
    public static void main(String[] args) {
        int arr[] = {1 , 3 , 4, 5, 5, 6};
        int target = 5;
        int binarySearchFirstOcc = first(arr, target);
        System.out.println("First ocuurence of element at index :"+ binarySearchFirstOcc);
    }
}