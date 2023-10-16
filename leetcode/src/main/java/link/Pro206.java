package link;

public class Pro206 {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode reverseList(ListNode head) {
        ListNode dummy=new ListNode(-1,null);
        ListNode p=head;
        while(p!=null){
            ListNode q=p;
            p=p.next;
            q.next=dummy.next;
            dummy.next=q;
        }
        return dummy.next;
    }
}
