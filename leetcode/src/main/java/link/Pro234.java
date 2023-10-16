package link;

import java.util.List;

public class Pro234 {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val,ListNode next) { this.val = val; this.next = next; }
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode fast=head,slow=head;
        while(fast!=null){
            fast=fast.next;
            if(fast!=null)
                fast=fast.next;
            else break;
            slow=slow.next;
        }
        ListNode head2=slow;
        head2=reverse(head2);
        fast=head;
        while(fast!=null&&head2!=null){
            if(fast.val!=head2.val)
                return false;
            fast=fast.next;
            head2=head2.next;
        }
        return true;
    }

    public static ListNode reverse(ListNode head){
        ListNode p=head;
        ListNode q=null;
        ListNode r;
        while(p!=null){
            r=p.next;
            p.next=q;
            q=p;
            p=r;
        }
        return q;
    }

    public static void main(String[] args) {
        ListNode p=new Pro234().new ListNode(2);
        ListNode head=new Pro234().new ListNode(1,p);
        System.out.println(isPalindrome(head));
    }
}
