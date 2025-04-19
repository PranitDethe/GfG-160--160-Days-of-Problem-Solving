class Solution {
    
    static class TrieNode {
        TrieNode[] children = new TrieNode[2];
    }
    private TrieNode root = new TrieNode();
    
    private void insert(int num) {
        TrieNode node = root;
        for (int i= 31; i >=0; i--) {
            int bit = (num >> i) & 1;
            if (node. children[bit]  == null)
            node.children[bit] = new TrieNode();
            node = node.children[bit];
        }
    }
    private int findMaxXor(int num) {
        TrieNode node = root;
        int maxXor = 0;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            int oppBit = 1 - bit;
            if(node.children[oppBit] != null) {
                maxXor |= (1 << i);
                node = node.children[oppBit];
            } else {
                node = node.children[bit];
            }        
            
        }
        return maxXor;
    }
    public int maxXor(int[] arr) {
        int max = 0;
        // code here
        insert(arr[0]);
        
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, findMaxXor(arr[i]));
            insert(arr[i]);
        }
        return max;
    }
}
