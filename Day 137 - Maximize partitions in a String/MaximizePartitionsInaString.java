class Solution {
    public int maxPartitions(String s) {
        int[] lastIndex = new int[26]; 
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        int partitions = 0;
        int maxLastIdx = 0;
        for (int i = 0; i < s.length(); i++) {
            maxLastIdx = Math.max(maxLastIdx, lastIndex[s.charAt(i) - 'a']);
            if (i == maxLastIdx) { 
                partitions++;
            }
        }

        return partitions;
    }
}
