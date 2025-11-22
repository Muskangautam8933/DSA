// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.
// Example 1:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

public class question3{
    public static int targetSum(int arr[] , int target){
        int n = arr.length;
        for(int i = 0; i< n; i++){
            for(int j = i+1; j< n; j++){
                if(arr[i] + arr[j] ==  target){
                    return target;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;
        int result = targetSum(arr, target);
        System.out.println("Target is present "+result);
    }
}