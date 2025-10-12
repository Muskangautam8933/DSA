public class question8{
    public static void main(String[] args) {
        int arr[] = {3 , 7 , 4 ,10,46, 73, 70};
        int n = arr.length;
        int max = 0;
        int sMax = 0;

        for(int i = 0;i < n;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum element in the arrays are : " + max);

        for(int i = 0; i<n ;i++){
            if(arr[i] > sMax && arr[i] != max){
                sMax = arr[i];
            }
        }
        System.out.print("Second maximum element in the arrays are :" +sMax);
    }
}