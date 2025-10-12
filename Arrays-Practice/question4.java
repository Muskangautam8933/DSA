public class question4{
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,0,10,54};
        int n = arr.length;
        int max = arr[0];
        for(int i = 0; i<n ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum element in the array are : " + max);
    }
}