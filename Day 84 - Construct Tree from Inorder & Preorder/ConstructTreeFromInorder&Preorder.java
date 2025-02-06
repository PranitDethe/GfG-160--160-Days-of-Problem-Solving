class Solution {
    static int preorderIndex = 0;
    static HashMap<Integer, Integer> inorderMap;

    public static Node buildTree(int inorder[], int preorder[]) {
        inorderMap = new HashMap<>();
        preorderIndex = 0;

        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        return buildTreeHelper(preorder, 0, inorder.length - 1);
    }

    private static Node buildTreeHelper(int[] preorder, int inorderStart, int inorderEnd) {
        if (inorderStart > inorderEnd) {
            return null;
        }

        int rootValue = preorder[preorderIndex++];
        Node root = new Node(rootValue);

        int rootIndex = inorderMap.get(rootValue);

        root.left = buildTreeHelper(preorder, inorderStart, rootIndex - 1);
        root.right = buildTreeHelper(preorder, rootIndex + 1, inorderEnd);

        return root;
    }

    public static void postorderTraversal(Node root) {
        if (root == null) return;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data + " ");
    }
}
