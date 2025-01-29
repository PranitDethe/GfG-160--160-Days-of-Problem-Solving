class Solution {
    public static void removeLoop(Node head) {
        if (head == null || head.next == null) return;

        Node slow = head, fast = head;
        Node loopNode = null;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                loopNode = slow;
                break;
            }
        }

        if (loopNode != null) {
            removeLoopNode(head, loopNode);
        }
    }

    private static void removeLoopNode(Node head, Node loopNode) {
        Node ptr1 = head;
        Node ptr2 = loopNode;

        if (ptr1 == ptr2) {
            while (ptr2.next != ptr1) {
                ptr2 = ptr2.next;
            }
            ptr2.next = null; 
            return;
        }

        while (ptr1.next != ptr2.next) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        ptr2.next = null;
    }
}
