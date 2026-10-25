public class BinarySearch {

    /**
     * Performs iterative binary search on a sorted integer array.
     *
     * @param arr    the sorted array to search in
     * @param target the value to search for
     * @return the index of target if found, otherwise -1
     */
    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            // Avoid potential overflow with (left + right) / 2
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 12, 16, 23, 38, 45, 56, 72, 91};
        int target = 23;

        System.out.println("Array: " + java.util.Arrays.toString(numbers));
        System.out.println("Searching for: " + target);

        int result = search(numbers, target);

        if (result != -1) {
            System.out.println("Found " + target + " at index: " + result);
        } else {
            System.out.println(target + " was not found in the array.");
        }
    }
}
