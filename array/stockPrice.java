public class stockPrice{

    public static int maxStockPrice(int num[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i< num.length; i++){
           if(buyPrice < num[i]){
            int profit = num[i] - buyPrice;
            maxProfit = Math.max(maxProfit, profit);
           }else{
            buyPrice = num[i];
           }
        }
        return maxProfit;
    }

    public static void main(String args[]){
        int num[] = {7,1,5,3,6,4};
       System.out.println(maxStockPrice(num));
    }
}