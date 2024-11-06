public class IncrementLargeInteger {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse the digits array from the last digit to the first
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, increment it by 1 and return the array
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If the current digit is 9, set it to 0 and carry the increment
            digits[i] = 0;
        }

        // If all digits were 9, create a new array to hold the result
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] digits1 = {1, 2, 3};
        int[] result1 = plusOne(digits1);
        System.out.println(java.util.Arrays.toString(result1)); // Output: [1, 2, 4]

        int[] digits2 = {4, 3, 2, 1};
        int[] result2 = plusOne(digits2);
        System.out.println(java.util.Arrays.toString(result2)); // Output: [4, 3, 2, 2]
    }
}
