class Solution {
    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        inorderHelper(root, result);
        return result;
    }

    private void inorderHelper(Node root, ArrayList<Integer> result) {
        if (root == null) return;

        inorderHelper(root.left, result);  
        result.add(root.data);             
        inorderHelper(root.right, result); 
    }
}
