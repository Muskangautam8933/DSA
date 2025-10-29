public class arrangingCoin{
    public static int coin(int n){
        if(n==0){
            return  0;
        }
        int lo = 0,hi =n;
        while(lo<= hi){
            int mid = lo+(hi-lo)/2;
            if(mid == n/mid){
                return mid;
            }else if(mid > n/mid){
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        return 0;
    }
    public static void main(String args[]){
        int n = 5;
        int ans =  coin(n);
        System.out.print("Number of completed rows :" + ans);
    }
}