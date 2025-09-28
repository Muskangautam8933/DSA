//Linear search
public class linearSearch{

    public static int linear(int arr[] , int key){
       int n = arr.length;

       for(int i = 0; i < n ; i++){
        if(arr[i] == key){
            return i;
        }
       }
       return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2 ,4 ,6 ,7 ,10, 50};
        int key = 7;
        
        int result = linear(arr, key);

        if(result != -1){
            System.out.print("Key is found at index : "+ result);
        }else{
             System.out.print("Key is not exist");
        }
    }
}