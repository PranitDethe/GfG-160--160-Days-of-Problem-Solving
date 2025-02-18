class Tree {
    public ArrayList<Integer> serialize(Node root) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null) return result;
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if(node == null) {
                result.add(null);
            } else {
                result.add(node.data);
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        return result;
    }

    public Node deSerialize(ArrayList<Integer> arr) {
        // code here
        if (arr.isEmpty()) return null;
        
        Iterator<Integer> it = arr.iterator();
        Node root = new Node(it.next());
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            
            if(it.hasNext()) {
                Integer leftVal = it.next();
                if(leftVal != null) {
                    node.left = new Node(leftVal);
                    queue.add(node.left);
                }
            }
            if (it.hasNext()) {
                Integer rightVal = it.next();
                if (rightVal != null) {
                    node.right = new Node(rightVal);
                    queue.add(node.right);
                }
            }
        }
        return root;
    }
};
