// Ques: Multiply odd indexed elements by 2 and add 10 to even indexed elements

public class question2{
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        int n = arr.length;
        for(int i = 0; i<n ; i++){
            if(i % 2 == 0){
                arr[i] = arr[i]*2;
            }else{
                arr[i] = arr[i] + 10;
            }

             System.out.print(arr[i]+" ");
        }
       
    }
}