public class missingNum{
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6,7};
        int n = arr.length+1;

        int sum = n*(n+1)/2;
        int arraySum = 0;
        for(int ele : arr){
            arraySum += ele;
        }
        int missNum = sum - arraySum;
        System.out.print( "Missing num is :" + missNum);
    }
}