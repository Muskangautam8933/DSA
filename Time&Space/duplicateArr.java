public class duplicateArr{
    public static void main(String[] args) {
        int arr[] = {5,1,3,4,2,4};
        int n = arr.length;

        for(int i = 0; i<n ; i++){
            for(int j = i+1; j<n ;j++){
                  if(arr[i] == arr[j]){
                    System.out.print("Duplicate number is : "+arr[i]);
                    break;
                  }
            }
        }
    }
}