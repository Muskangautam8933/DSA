public class lastOccurence{
    public static int last(int arr[] ,int tar){
     int lo = 0 , hi = arr.length-1 , idx = -1;
         while(lo <= hi){
            int mid = (lo + hi)/2;
            if(arr[mid] > tar){
                hi = mid - 1;
            }else if(arr[mid] < tar){
                lo = mid + 1;
            }else{
                idx = mid;
                lo = mid + 1;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int arr[] = {1 , 3, 4, 5, 5, 6};
        int tar = 5;
        int lastOccuenceOfEement  = last(arr, tar);
        System.out.println("Last Occurence of element at inx :"+ lastOccuenceOfEement);

      
    }
}