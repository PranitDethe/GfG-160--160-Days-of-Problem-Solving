class Solution {
    Node first, middle, last, prev;

    void correctBST(Node root) {
        first = middle = last = prev = null;

        inorder(root);

        if (first != null && last != null) {
            int temp = first.data;
            first.data = last.data;
            last.data = temp;
        }
        else if (first != null && middle != null) {
            int temp = first.data;
            first.data = middle.data;
            middle.data = temp;
        }
    }

    private void inorder(Node node) {
        if (node == null) return;

        inorder(node.left);

        if (prev != null && node.data < prev.data) {
            if (first == null) {
                first = prev;
                middle = node;
            } else {
                last = node;
            }
        }
        prev = node;

        inorder(node.right);
    }
}
