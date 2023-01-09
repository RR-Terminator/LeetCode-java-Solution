public class LeetCode_Problem_234 {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(ListNode head) {

        ListNode firstHead = head;
        ListNode middle = middleNode(head);
        ListNode Secondhead = reverseList(middle.next);
        while (Secondhead != null){
            if (firstHead.val != Secondhead.val ) {
                return false;
            }
            firstHead = firstHead.next;
            Secondhead = Secondhead.next;
        }
        return true;

    }

    public ListNode reverseList(ListNode head) {
        if(head == null ) return head;
        ListNode prev = null;
        ListNode present  = head;
        ListNode next = head.next;
        while(present!=null){
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }

    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast !=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;

    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
