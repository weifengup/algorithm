package link;

public class Pro203 {
      public class ListNode {
          int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
            return head;
        ListNode hhead=new ListNode(-1,head);
        ListNode p=hhead;
        while(p.next!=null){
            if(p.next.val==val){
                p.next=p.next.next;
            }
            p=p.next;
        }
        return hhead.next;
    }
}
