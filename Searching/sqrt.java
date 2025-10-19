public class sqrt{
    public static int sqrtNum(int n){
        int lo = 0,hi= n;
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            if(mid == n/mid){
                return mid;
            }else if(mid > n/mid){
                hi = mid-1;
            }else{
                lo = mid+1;
            }
        }
        return hi;
    }
    public static void main(String args[]){
        int n = 4;
        int ans = sqrtNum(n);
        System.out.print("The square root of x number is :"+ ans);
    }
}