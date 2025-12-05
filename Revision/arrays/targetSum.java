//Program to find the total number of pairs in the arrays whose sum is equal to the given value x
public class targetSum{
    public static int target(int arr[] , int target){
        int n = arr.length;
        int ans = 0;

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] + arr[j] == target){
                   ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,3,6,8,5,9};
        int target = 7;
        System.out.println("Total number of pairs are : "+target(arr , target));

    }
}