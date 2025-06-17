package arrays;

import java.util.Arrays;

public class ArrayPositionLeft {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 3;

        int n = arr.length;
        k = k % n; // normalize k

        for (int r = 0; r < k; r++) {
            int first = arr[0];

            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[n - 1] = first;
        }

        System.out.println("Array after left rotation by " + k + " position: " + Arrays.toString(arr));
    }
}
