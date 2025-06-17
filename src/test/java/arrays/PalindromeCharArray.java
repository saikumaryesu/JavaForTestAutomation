package arrays;

public class PalindromeCharArray {
    public static void main(String[] args) {
        char[] input = {'r', 'a', 'd', 'a', 'r'};

        boolean result = isPalindrome(input);

        System.out.println("Is Palindrome? " + result);
    }

    public static boolean isPalindrome(char[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
