public class frequencyArr{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,5,4 ,3,2,1};
        int n = arr.length;
        int freq[] = new int[n];
        int count = 1;
        int visited = -1;


        for(int i = 0; i<n; i++){
            for(int j = i+1; j< n; j++){
                if(arr[i] == arr[j]){
                    count++;
                    freq[j] = visited;
                }

                if(freq[i] != visited){
                    freq[i] = count;
                }

            }
        }
        for(int i = 0; i < freq.length ; i++){
            if(freq[i] != visited){
                System.out.println(arr[i] +  " frequency is : " + freq[i]);

            }
        }

    }
}