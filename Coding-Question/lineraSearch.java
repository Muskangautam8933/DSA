public class lineraSearch{

    public static int linearSearch(int arr[], int x){
        int n = arr.length;

        for(int i = 0; i<n ;i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 3, 4, 1, 7, 5 };
        int ele = 7;

        int index = linearSearch(arr, ele);

        if(index == -1){
            System.out.println("Your element is not found in arrays");
        }else{
            System.out.print("your element at index : "+ index);
        }
    }

}