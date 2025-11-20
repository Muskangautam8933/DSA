public class countDupicate {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,2,4,9,4,5,4,5};
        int n = arr.length;

        boolean foundDuplicate = false;

        for (int i = 0; i < n; i++) {

            // Skip already marked elements
            if (arr[i] == -1) continue;

            int count = 1;

            // Count occurrences
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // Print only if count > 1
            if (count > 1) {
                System.out.println("Duplicate element : " + arr[i] + " (count: " + count + ")");
                foundDuplicate = true;
            }

            // Mark duplicates so they're not counted again
            for (int k = i + 1; k < n; k++) {
                if (arr[i] == arr[k]) {
                    arr[k] = -1;
                }
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicate element is found");
        }
    }
}
