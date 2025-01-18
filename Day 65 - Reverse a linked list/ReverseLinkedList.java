class Solution {
    Node reverseList(Node head) {
        // code here
        Node prev = null;
        Node curr = head;
        Node next = head.next;
        
        while(curr.next != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next.next;
        }
        curr.next = prev;
        return curr;
    }
}
