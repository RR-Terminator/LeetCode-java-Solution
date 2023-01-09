public class LeetCode_Problem_148 {
    public static void main(String[] args) {

    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = middleNode(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return mergeTwoLists(left,right);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode ans = new ListNode();
        ListNode node = ans;

        while(list1 != null && list2 != null){
            if (list1.val < list2.val) {
                node.next = list1;
                list1 =list1.next;
                node = node.next;
            }
            else {
                node.next = list2;
                list2 =list2.next;
                node = node.next;
            }
        }

        while (list1 != null){
            node.next = list1;
            list1 =list1.next;
            node = node.next;
        }
        while (list2 != null){
            node.next = list2;
            list2 =list2.next;
            node = node.next;
        }
        return ans.next;
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
