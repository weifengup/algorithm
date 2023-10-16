package link;

import java.util.List;
import java.util.Map;

public class Pro1290 {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static int getDecimalValue(ListNode head) {
        int ans=0;
        ListNode p=head;
        while(p!=null){
            ans=ans*2+p.val;
            p=p.next;
        }
        return ans;
    }

    public static void main(String[] args) {
        Pro1290 p=new Pro1290();
        ListNode ln3=p.new ListNode(1);
        ListNode ln2=p.new ListNode(0,ln3);
        ListNode ln1=p.new ListNode(1,ln2);
        System.out.println(getDecimalValue(ln1));
    }
}
