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
     * @param head: head is the head of the linked list
     * @return: head of the linked list
     */
    public ListNode deleteDuplicates(ListNode head) {
        // write your code here
        if(head == null || head.next == null) return head;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(ListNode i = head;i != null; i = i.next)
        {
            Integer v = i.val;
            if(hm.containsKey(v))
            {
                hm.put(v, 2);
            }
            else 
            {
                hm.put(v, 1);
            }
        }
        ListNode res = new ListNode(0);
        ListNode temp = res;
        for(ListNode i = head;i != null; i = i.next)
        {
            Integer v = i.val;
            if(hm.get(v) == 1)
            {
                temp.next = new ListNode(i.val);
                temp= temp.next;
            }
        }
        return res.next;
    }
}