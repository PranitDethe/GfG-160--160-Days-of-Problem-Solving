class Solution {
    static String longestPalindrome(String s) {
        int n = s.length();
        if (n <= 1) return s;

        int start = 0, maxLength = 1;

        for (int i = 0; i < n; i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int maxLen = Math.max(len1, len2);

            if (maxLen > maxLength) {
                maxLength = maxLen;
                start = i - (maxLen - 1) / 2; 
            }
        }

        return s.substring(start, start + maxLength);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; 
    }
}
