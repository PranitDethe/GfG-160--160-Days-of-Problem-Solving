class Solution {
    int maxSum;

    int findMaxSum(Node root) {
        maxSum = Integer.MIN_VALUE;
        findMaxPath(root);
        return maxSum;
    }

    private int findMaxPath(Node node) {
        if (node == null) return 0;

        int leftMax = Math.max(0, findMaxPath(node.left));   
        int rightMax = Math.max(0, findMaxPath(node.right)); 

        int nodeMax = node.data + leftMax + rightMax;

        maxSum = Math.max(maxSum, nodeMax);

        return node.data + Math.max(leftMax, rightMax);
    }
}
