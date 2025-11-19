public class sumOfArrEle{
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12};
        int n = arr.length;
        int sum = 0;

        for(int i = 0; i<n ;i++){
            sum = sum + arr[i];
        }
        System.out.println("sum of array element are : " + sum);
    }
}