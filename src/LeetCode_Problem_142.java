public class LeetCode_Problem_142 {

    public ListNode detectCycle(ListNode head) {
        int length = 0 ;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow ){
                length = CycleLength(slow);
                break;
            }
        }

        if( length == 0) return null;

        ListNode f = head;
        ListNode s = head;

        while(length>0){
            s = s.next;
            length--;
        }
        while(f!=s){
            f = f.next;
            s = s.next;
        }
        return f;
    }
    public int  CycleLength(ListNode head) {

        if(head == null) return 0;

        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            int length = 0;
            if(fast == slow ){
                ListNode temp = slow;
                do {
                    temp = temp.next;
                    length++;
                } while (temp!=fast);
                return length;
            }
        }
        return 0;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
