class Solution {
    public static Node findFirstNode(Node head) {
        // code here
        Node slow = head, fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast) break;
        }
        
        if(fast == null || fast.next == null) return new Node(-1);
        else {
            slow = head;
            while(fast != slow) {
                slow = slow.next;
                fast = fast.next;
            }
        }
        return fast;
    }
}
