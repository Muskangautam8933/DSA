
public class firstRepeat{
    public static int repeat(int arr[]){
        int n = arr.length;
        for(int i = 0; i< n; i++){
            for(int j = i+1; j< n; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,4,3,4};
        int result =  repeat(arr);

        if(result == -1){
            System.out.print("No repeated element is found");
        }else{
            System.out.print("repeated element is found : " + result);
        }

    }
}