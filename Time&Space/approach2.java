public class approach2{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,4};
        int n = arr.length;

        boolean flag[] = new boolean[n+1];
        for(int i = 0; i< n;i++){
            int ele = arr[i];
            if(flag[ele] == true){
                System.out.print("duplicate element : "+ ele);
            }else{
                flag[ele] = true;
            }
        }
    }
}