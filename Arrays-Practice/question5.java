public class question5{
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,1,10,54};
        int n = arr.length;
        int min = arr[0];
        for(int i = 0; i<n ; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("minimum element in the array are : " + min);
    }
}