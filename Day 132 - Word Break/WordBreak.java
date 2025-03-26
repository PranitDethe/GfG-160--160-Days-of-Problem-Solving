class Solution {
    public boolean wordBreak(String s, String[] dictionary) {
        // code here
        Set<String> ws = new HashSet<>(Arrays.asList(dictionary));
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        
        for (int i = 1; i <= n; i++) {
            for (int j = i - 1; j >= Math.max(i - 100, 0); j--) {
                if (dp[j] && ws.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}
