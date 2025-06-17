package arrays;

import java.util.Arrays;

public class ArrayPositionRight {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        int k = 3;

        k = k % n; // Normalize k

        for (int r = 0; r < k; r++) {
            int last = arr[n - 1];

            // Shift all elements right by 1 position
            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }

            arr[0] = last;
        }

        System.out.println("Array after right rotation by " + k + " positions: " + Arrays.toString(arr));
    }
}
