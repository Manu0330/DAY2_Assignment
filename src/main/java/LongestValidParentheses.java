public class LongestValidParentheses {
    public static int longestValidParentheses(String s) {
        int maxLength = 0;
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        stack.push(-1); // Base index for calculation

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop(); // Pop the last open parenthesis index
                if (!stack.isEmpty()) {
                    maxLength = Math.max(maxLength, i - stack.peek());
                } else {
                    stack.push(i); // Push current index as base for next valid substring
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(longestValidParentheses("((()")); // Output: 2
        System.out.println(longestValidParentheses(")()())")); // Output: 4
    }
}
