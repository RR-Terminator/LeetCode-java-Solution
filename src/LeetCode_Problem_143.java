public class LeetCode_Problem_143 {
    public static void main(String[] args) {

    }



    public void reorderList(ListNode head) {

        if (head == null || head.next == null){
            return;
        }
        ListNode Firsthead  = head;
        ListNode mid = middleNode(head);
        ListNode SecondHead = reverseList(mid);
        while (Firsthead != null && SecondHead != null  ){
            ListNode Temp = Firsthead.next;
            Firsthead.next = SecondHead;
            Firsthead  = Temp;


            Temp = SecondHead.next;
           SecondHead.next = Firsthead;
           SecondHead =Temp;
        }

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

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
