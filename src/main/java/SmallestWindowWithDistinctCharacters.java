public class SmallestWindowWithDistinctCharacters {
    public static int smallestWindow(String s) {
        int n = s.length();
        java.util.Set<Character> uniqueChars = new java.util.HashSet<>();

        // Store all unique characters in the string
        for (int i = 0; i < n; i++) {
            uniqueChars.add(s.charAt(i));
        }

        // Number of unique characters
        int required = uniqueChars.size();

        // Initialize sliding window
        int start = 0, end = 0, minLength = n + 1;
        java.util.Map<Character, Integer> charCount = new java.util.HashMap<>();

        while (end < n) {
            charCount.put(s.charAt(end), charCount.getOrDefault(s.charAt(end), 0) + 1);

            // If the window has all distinct characters, try to shrink it
            while (charCount.size() == required) {
                minLength = Math.min(minLength, end - start + 1);
                charCount.put(s.charAt(start), charCount.get(s.charAt(start)) - 1);
                if (charCount.get(s.charAt(start)) == 0) {
                    charCount.remove(s.charAt(start));
                }
                start++;
            }
            end++;
        }

        return (minLength == n + 1) ? -1 : minLength;
    }

    public static void main(String[] args) {
        System.out.println(smallestWindow("aabcbcdbca")); // Output: 4
        System.out.println(smallestWindow("aaaa")); // Output: 1
    }
}
