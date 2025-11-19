public class reverseWithoutTemp{

    public static void reverse(int arr[]) {
    int i = 0, j = arr.length - 1;

    while (i < j) {
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];

        i++;
        j--;
    }
    
}

    public static void main(String[] args) {
        int arr[] = {2,4,6,3,56,356,22};
        reverse(arr);

        System.out.print("reverse array is : ");
        for(int x : arr){
            System.out.print(x + " ");
        }
        
    }
}