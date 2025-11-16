
/*Given an integer array and return the prefix sum runnign sum in the same array without creating a new array
a = {2,1,3,4,5}
prefixSum = {2,3,6,10,15}
             0 1 2 3  4
prefix[0] = a[0]
prefix[1] = a[0]+a[1]
prefix[2] = a[0]+a[1]+a[2]
prefix[3] = a[0]+a[1]+a[2]+a[3]
prefix[4] = a[0]+a[1]+a[2]+a[3]+a[4]

*/

public class prefixSum {

    public static int[] prefixSumArr(int arr[]) {
        int n = arr.length;
        int pre[] = new int[n];
        pre[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] + arr[i];
        }
        return pre;
    }

    public static void printArr(int pre[]) {
        for (int i = 0; i < pre.length; i++) {
            System.out.print(pre[i] + " ");

        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 3, 4, 5};

        int result[] = prefixSumArr(arr);
        printArr(result);
    }
}
