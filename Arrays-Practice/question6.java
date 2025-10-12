public class question6{
    public static void main(String[] args) {
        
        int arr[] = {2 , 5 , 10 , 3 , 6 , 9};
        int n = arr.length;

        for(int i = 0; i< n ; i++){
            if(i % 2 == 0 ){
               arr[i] = arr[i] * 2;
            }else{
                arr[i] = arr[i] + 10;
            }

            System.out.print(arr[i] + " ");
        }
    } 
}