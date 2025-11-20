public class duplicateNum{
    public static void main(String[] args) {
        int arr[] = {3,5,1,7,2,8,9,0,1};
        int n = arr.length;
          
        boolean found = false;
        for(int i = 0; i< n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] == arr[j]){
                    System.out.println("Duplicate element is present in arrays : "+ arr[i]);
                    found = true;
                    break;
                }
            }
        }
        if(!found){
            System.out.println("Duplicate lement is not present in arrays ");
        }
    }
}