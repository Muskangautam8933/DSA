public class sumOfArr{
    public static int soa(int arr[] , int idx){
        if(idx== arr.length){
            return 0;
        }

        int smallAns = soa(arr, idx+1);
        return smallAns+arr[idx];
    }
    public static void main(String[] args) {
        int arr[] = {3,5,2,1};
        System.out.print("Sum of arrays element are : "+soa(arr, 0));

    }
}