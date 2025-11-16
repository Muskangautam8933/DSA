public class FirstRepeatedEle{
    public static int FirstRepeatedElement(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            for(int j = 0; j < n; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,2,3};
        System.out.println(FirstRepeatedElement(arr));
        
    }
}