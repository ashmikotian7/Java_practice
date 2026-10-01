import java.util.Arrays;
public class a10 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};

        System.out.println("Original Array: " + Arrays.toString(arr));
        Arrays.sort(arr);

        System.out.println("Sorted Array (Ascending): " + Arrays.toString(arr));
    }
}