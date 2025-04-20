public class maxSubArr{
    public static  int maxSubArrSum(int num[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i<num.length; i++){
            int start = i;
            for(int j = i; j < num.length; j++){
                int end = j;
                for(int k = start; k < end ; k++){
                    currSum += num[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum:" + maxSum);
        return 0;
    }
    public static void main(String args[]){
        int num[] = {1,-2,6,-1,3};
        maxSubArrSum(num);
    }

}