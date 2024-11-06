public class LongestSubstringWithoutRepeating {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int start = 0;
        java.util.Map<Character, Integer> charMap = new java.util.HashMap<>();

        for (int end = 0; end < n; end++) {
            // If the character is already in the map, move the start pointer
            if (charMap.containsKey(s.charAt(end))) {
                start = Math.max(charMap.get(s.charAt(end)) + 1, start);
            }

            // Update the map with the current character and its index
            charMap.put(s.charAt(end), end);
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("ABCBC")); // Output: 3
        System.out.println(lengthOfLongestSubstring("AAA")); // Output: 1
    }
}
