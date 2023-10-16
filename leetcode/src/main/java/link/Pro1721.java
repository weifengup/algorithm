package link;

public class Pro1721 {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode swapNodes(ListNode head, int k) {
        ListNode hhead=new ListNode(-1,head);
        ListNode p=hhead,q=hhead;
        for(int i=0;i<k;i++){
            q=q.next;
        }
        ListNode left=q;
        while(q!=null){
            q=q.next;
            p=p.next;
        }
        int temp=p.val;
        p.val= left.val;
        left.val=temp;
        return hhead.next;
    }
}
