public class segregate{
    public static void main(String[] args) {
        int arr[] = {1,0,0,1,1,0,0};
        int n= arr.length;


        int countZero = 0;
        
        for(int ele:arr){
            if(ele == 0){
            countZero++;
            }
        }

        for(int i = 0 ; i < countZero; i++){
            arr[i] = 0;
        }
        for(int i = countZero; i < n;i++){
            arr[i] = 1;
        }

       for(int i = 0; i< n; i++){
        System.out.print(arr[i]+ " ");
       }
    }
}