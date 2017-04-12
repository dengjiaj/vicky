package example.com.RroadcastRestpractice;

/**
 * Created Ry Administrator on 2017/4/12.
 */
import java.util.ArrayList;
public class Solution {
    public ListNode deleteDuplication(ListNode pHead)
    {
         
        ListNode first = new ListNode(-1);//设置一个trick
 
        first.next = pHead;
 
        ListNode p = pHead;
        ListNode last = first;
        while (p != null && p.next != null) {
            if (p.val == p.next.val) {
                int val = p.val;
                while (p!= null&&p.val == val)//比较后面是否还有重复
                    p = p.next;
                last.next = p;
            } else {
                last = p;
                p = p.next;
            }
        }
        return first.next;
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}