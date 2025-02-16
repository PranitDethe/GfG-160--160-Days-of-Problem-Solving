class Solution {
    public boolean findTarget(Node root, int target) {
        HashSet<Integer> set = new HashSet<>();
        return inorderCheck(root, set, target);
    }

    private boolean inorderCheck(Node node, HashSet<Integer> set, int target) {
        if (node == null) return false;

        if (inorderCheck(node.left, set, target)) return true;

        if (set.contains(target - node.data)) return true;

        set.add(node.data);

        return inorderCheck(node.right, set, target);
    }
}
