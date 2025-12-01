public class findAllIndices{

    public static int findAllIdx(int arr[] , int n, int target , int idx){
        if(idx >= n){
            return idx;
        }

        if(arr[idx] == target){
            System.out.println("element are present at indices : " +idx);
        }
        return findAllIdx(arr, n, target, idx+1);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,7,2,2,0,2};
        int target = 2;
        int n = arr.length;
        findAllIdx(arr, n, target, 0);
    }
}