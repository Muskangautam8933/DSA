public class product2{
    public static int productArr(int arr[] ){
        int n = arr.length;
        int product = 1;

        for(int i = 0; i< n; i++){
            product = product * arr[i];
        }
        return product;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};

        System.out.print("product of array elements are : "+ productArr(arr));

    }
}