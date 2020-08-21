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
     * @param head: a ListNode
     * @param val: An integer
     * @return: a ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
        // write your code here
        if(head == null) return null;
        ListNode res = new ListNode(0);
        ListNode temp = res;
        while(head != null)
        {
            if(head.val != val)
            {
                temp.next = new ListNode(head.val);
                temp = temp.next;
            }
            head = head.next;
        }
        return res.next;
    }
}