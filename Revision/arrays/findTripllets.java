//Program to count the number of triplets whose sum is equal to the given value x
public class findTripllets{
    public static int tripllets(int arr[] , int target){
        int n = arr.length;
        int ans = 0;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n ; k++){
                    if(arr[i] + arr[j] + arr[k] == target){
                       ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,7,9,2,1,5,6};
        int target = 7;
        System.out.print("Number of tripllets present : "+tripllets(arr, target));

    }
}