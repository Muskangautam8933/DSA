public class arrangingCoin1{
    public static int coin(int n){
        if(n==0){
            return 0;
        }
        int lo = 0, hi = n , ans = 0;
        while(lo <= hi){
            int k = lo + (hi-lo)/2;
            int m = k*(k+1)/2;

            if(m==n){
                return k;
            }else if(m > n){
                hi = k - 1;
            }else{
                ans = k;
                lo = k + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        int ans = coin(n);
        System.out.print("Number of complleted rows : " +ans);
    }
}