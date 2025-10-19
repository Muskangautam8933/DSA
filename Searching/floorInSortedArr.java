public class floorInSortedArr{

    public static int floor(int arr[], int x){
        int lo = 0 , hi = arr.length-1 , idx = -1;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(arr[mid] <= x){
                idx = mid;
                lo = mid + 1;
            }else{
                hi = mid -1;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 10, 10, 12, 19};
        int x = 5;
        int ans =  floor(arr , x);
        System.out.print("Floor value in sorted arr is at index :" + ans);
    }
}






