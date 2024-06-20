package mindtek.Leetcode;

import java.util.List;

public class RemoveElements {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return head;
        ListNode pr = head;
        ListNode c = head.next;
        while(c!=null){
            if(c.val==val){
                pr.next= c.next;
                c = c.next;
            } else{
                pr =c;
                c=c.next;
            }
        }

        if(head.val==val) return head.next;


        return head;
    }

}
