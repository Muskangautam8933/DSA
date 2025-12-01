public class linearSearch{
    public static int linear(int arr[] , int n , int target ,int idx){
        //base case 
        if(idx >= n){
            return -1;
        }

        //recursive work
        if(arr[idx] == target){
            return idx;
        }
        //self work
        return linear(arr, n, target, idx+1);

    }
    public static void main(String[] args) {
        int arr[] = {2,5,9,4,0,1};
        int target = 4;
        int n = arr.length;
        System.out.println("element is present at index : "+linear(arr, n, target, 0));
    }
}