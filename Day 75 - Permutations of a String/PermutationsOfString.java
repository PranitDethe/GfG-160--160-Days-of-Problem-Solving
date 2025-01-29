class Solution {
    public ArrayList<String> findPermutation(String s) {
        // Code here
        Set<String> ans = new HashSet<>();
        boolean[] visit = new boolean[s.length()];
        make(s, ans, "", visit);
        return new ArrayList(ans);
    }
    static void make(String s, Set<String> ans, String curr, boolean[] visit) {
        if (curr.length() == s.length()) {
            ans.add(curr);
            return;
        }
        for(int i = 0; i < s.length(); i++) {
            if(!visit[i]) {
                visit[i] = true;
                make(s, ans, curr + s.charAt(i), visit);
                visit[i] = false;
            }
        }
    }
}
