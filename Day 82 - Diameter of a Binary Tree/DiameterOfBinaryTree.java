class Solution {
    int maxDiameter = 0;

    private int height(Node node) {
        if (node == null) return 0;

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    int diameter(Node root) {
        maxDiameter = 0;
        height(root);
        return maxDiameter;
    }
}
