public class min{
    public static int findMinNum(int arr[]){
        int min = Integer.MAX_VALUE;
        int n = arr.length;

        for(int i = 0; i< n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = { 20, 5, 3 , 8 , 30 , 60, 0 ,60 ,4};
        System.out.println("Your minimum number in arrays is : "+findMinNum(arr));
        
    }
}