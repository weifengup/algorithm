package link;

public class Pro83 {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode p=head;
        while(p!=null){
            if(p.next!=null&&p.val==p.next.val){
                p.next=p.next.next;
            }else{
                p=p.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {

    }
}
