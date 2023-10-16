package link;

import java.util.List;

public class Pro19 {
    class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode hhead=new ListNode(-1,head);
        ListNode p=hhead,q=head;
        for(int i=0;i<n;i++){
            q=q.next;
        }
        while(q!=null){
            q=q.next;
            if(q==null)
                break;
            p=p.next;
        }
        ListNode temp=p.next;
        if(temp!=null)
            p.next=temp.next;
        else p.next=null;
        return hhead.next;
    }

    public static void main(String[] args) {
        Pro19 p19=new Pro19();
        ListNode ln=p19.new ListNode(1);
        System.out.println(p19.removeNthFromEnd(ln,1));
    }
}
