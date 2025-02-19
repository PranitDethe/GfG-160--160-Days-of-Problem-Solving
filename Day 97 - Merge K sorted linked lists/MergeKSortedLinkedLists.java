class Solution {
    // Function to merge K sorted linked list.
    Node mergeKLists(List<Node> arr) {
        // Add your code here.
       
            if (arr == null || arr.isEmpty()) return null;
            return mergeHelper(arr, 0, arr.size() - 1);
        }
        
        private Node mergeHelper(List<Node> arr, int left, int right) {
            if(left == right) return arr.get(left);
            
            int mid = left + (right - left) / 2;
            Node l1 = mergeHelper(arr, left, mid);
            Node l2 = mergeHelper(arr, mid + 1, right);
            return mergeTwoLists(l1, l2);
        }
            private Node mergeTwoLists(Node l1, Node l2) {
                Node dummy = new Node(-1);
                Node tail = dummy;
                
                while(l1 != null && l2 != null) {
                    if (l1.data < l2.data) {
                        tail.next = l1;
                        l1 = l1.next;
                    } else {
                        tail.next = l2;
                        l2 = l2.next;
                    }
                    tail = tail.next;
                }
                if (l1 != null) tail.next = l1;
                if (l2 != null) tail.next = l2;
                
                return dummy.next;
        
        
    }
}
