package link;

public class Pro82 {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode newHead=null;
        ListNode pre=null;
        ListNode p=head;
        while(p!=null){
            if(p.next!=null&&p.val==p.next.val){
                int temp=p.val;
                while(p!=null&&p.val==temp){
                    p=p.next;
                }
            }else{
                if(newHead==null)
                    newHead=p;
                if(pre!=null)
                    pre.next=p;
                pre=p;
                p=p.next;
            }
        }
        return newHead;
    }
}
