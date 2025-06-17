package arrays;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        moveZerosToEnd(arr);

        System.out.println("After moving zeros: " + Arrays.toString(arr));
    }

    public static void moveZerosToEnd(int[] arr) {
        int index = 0; // position to place non-zero elements

        // Step 1: Move non-zero elements forward
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        // Step 2: Fill remaining positions with zero
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }
}
