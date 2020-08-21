/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param head: The head of linked list.
     * @param val: An integer.
     * @return: The head of new linked list.
     */
    public ListNode insertNode(ListNode head, int val) {
        // write your code here
        if(head == null) return new ListNode(val);
        ListNode father = new ListNode(Integer.MIN_VALUE);
        father.next = head;
        for(ListNode i=father;i.next!=null;i=i.next)
        {
            if(i.next.val>=val)
            {
                if(i.val<=val)
                {
                    ListNode temp = new ListNode(val);
                    temp.next = i.next;
                    i.next = temp;
                    break;
                }
            }
            else
            {
                if(i.next.next == null)
                {
                    i.next.next = new ListNode(val);
                    break;
                }
            }
        }
        return father.next;
    }
}