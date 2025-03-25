class Solution {
     static HashMap<String, Integer> memo;
    static int countWays(String s) {
        // code here
         memo = new HashMap<>();
        return countWaysUtil(s, 0, s.length() - 1, true);
    }
    
    private static int countWaysUtil(String s, int i, int j, boolean isTrue) {
        if (i > j) return 0;
        if (i == j) {
            if (isTrue) return s.charAt(i) == 'T' ? 1 : 0;
            else return s.charAt(i) == 'F' ? 1 : 0;
        }
        
        String key = i + "_" + j + "_" + isTrue;
        if (memo.containsKey(key)) return memo.get(key);
        
        int ways = 0;
        for (int k = i + 1; k < j; k += 2) {
            int leftTrue = countWaysUtil(s, i, k - 1, true);
            int leftFalse = countWaysUtil(s, i, k - 1, false);
            int rightTrue = countWaysUtil(s, k + 1, j, true);
            int rightFalse = countWaysUtil(s, k + 1, j, false);
            
            char operator = s.charAt(k);
            
            if (operator == '&') {
                if (isTrue) ways += leftTrue * rightTrue;
                else ways += leftFalse * rightFalse + leftTrue * rightFalse + leftFalse * rightTrue;
            } else if (operator == '|') {
                if (isTrue) ways += leftTrue * rightTrue + leftTrue * rightFalse + leftFalse * rightTrue;
                else ways += leftFalse * rightFalse;
            } else if (operator == '^') {
                if (isTrue) ways += leftTrue * rightFalse + leftFalse * rightTrue;
                else ways += leftTrue * rightTrue + leftFalse * rightFalse;
            }
        }
        
        memo.put(key, ways);
        return ways;
        
    }
}
