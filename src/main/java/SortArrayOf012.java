public class SortArrayOf012 {
    public static void sortArray(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        // Use Dutch National Flag problem algorithm
        while (mid <= high) {
            if (arr[mid] == 0) {
                // Swap arr[low] and arr[mid], increment both
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                // Just move the mid pointer
                mid++;
            } else {
                // Swap arr[mid] and arr[high], decrement high
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 1, 0, 2, 1, 0};
        sortArray(arr1);
        System.out.println(java.util.Arrays.toString(arr1)); // Output: [0, 0, 0, 1, 1, 1, 2, 2]

        int[] arr2 = {2, 1, 0, 1, 2, 0, 1, 0};
        sortArray(arr2);
        System.out.println(java.util.Arrays.toString(arr2)); // Output: [0, 0, 0, 1, 1, 1, 2, 2]
    }
}
