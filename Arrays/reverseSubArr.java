public class reverseSubArr{
    public static void main(String[] args) {
        int arr[] = {3,5,7,9,10,34,65,31,23};
        int n = arr.length;

        int i = 2 , j = 6;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}