package link;

import java.util.List;

public class Pro61 {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static int getLength(ListNode head){
        ListNode p=head;
        int len=0;
        while(p!=null){
            len++;
            p=p.next;
        }
        return len;
    }
    public static ListNode rotateRight(ListNode head, int k) {
        ListNode ans=null;
        int len=getLength(head);
        int index=len%k;
        if(index==0)
            return head;
        index=len-index;
        ListNode p=head;
        for(int i=0;i<index;i++){
            p=p.next;
        }
        ans=p.next;
        p.next=null;
        p=ans;
        while(p!=null&&p.next!=null){
            p=p.next;
        }
        p.next=head;
        return ans;
    }
}
