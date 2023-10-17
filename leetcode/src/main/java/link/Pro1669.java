package link;

public class Pro1669 {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode p=list1;
        ListNode q=list2;
        ListNode left=null,right=null;
        for(int i=0;i<a-1;i++){
            p=p.next;
        }
        left=p;
        for(int i=a-1;i<b+1;i++){
            p=p.next;
        }
        right=p;
        while(q!=null&&q.next!=null)
            q=q.next;
        q.next=right;
        left.next=list2;
        return list1;
    }
}
