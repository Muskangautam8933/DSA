public class PeakElement{
    public static int peakElementInMountain(int arr[]){
      int lo = 1 , hi = arr.length-2;
      while(lo <= hi){
        int mid = (lo+hi)/2;
        if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
            return mid;
        }else if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid + 1]){
            lo = mid -1;
        }else{
            hi = mid + 1;
        }
      }
      return 0;
    }
    public static void main(String[] args) {
        int arr[] = {0,10,5,2};
        int peakEle = peakElementInMountain(arr);
        System.out.print("Peak element in the mountain array is at index: "+ peakEle);
    }
}