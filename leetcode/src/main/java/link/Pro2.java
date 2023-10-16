package link;

public class Pro2 {
    class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p=l1,q=l2;
        ListNode ans=new ListNode(-1,null);
        ListNode r=ans;
        int carry=0;
        while(p!=null&&q!=null){
            carry=carry+p.val+q.val;
            ListNode temp=new ListNode(carry%10);
            carry=carry/10;
            r.next=temp;
            r=temp;
            p=p.next;
            q=q.next;
        }
        while(p!=null){
            carry=carry+p.val;
            ListNode temp=new ListNode(carry%10);
            carry=carry/10;
            r.next=temp;
            r=temp;
            p=p.next;
        }
        while(q!=null){
            carry=carry+q.val;
            ListNode temp=new ListNode(carry%10);
            carry=carry/10;
            r.next=temp;
            r=temp;
            q=q.next;
        }
        if(carry!=0){
            ListNode temp=new ListNode(carry);
            r.next=temp;
            r=temp;
        }
        return ans.next;
    }
}
