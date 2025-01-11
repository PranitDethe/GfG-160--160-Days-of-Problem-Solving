class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        int maxLen = 0, left = 0, right = 0;
        
        while(right < n) {
            if(!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                maxLen = Math.max(maxLen, right - left);
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLen;
    }
}
