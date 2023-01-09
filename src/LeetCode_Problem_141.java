public class LeetCode_Problem_141 {
    public static void main(String[] args) {



    }

    public boolean hasCycle(ListNode head) {

        if(head == null) return false;

        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow ){
                return true;
            }
        }
        return false;
    }

    private  static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
