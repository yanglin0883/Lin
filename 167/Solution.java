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
     * @param l1: the first list
     * @param l2: the second list
     * @return: the sum list of l1 and l2 
     */
    public ListNode addLists(ListNode l1, ListNode l2) {
        // write your code here
        ListNode t1=l1;
        ListNode t2=l2;
        ListNode res = new ListNode(0);
        ListNode temp = res;
        int value =0;
        int digit =0;
        while(true)
        {
            if(t1 == null && t2 == null) break;
            else if(t1 != null && t2 != null)
            {
                value = t1.val + t2.val;
            }
            else if(t1 == null && t2 != null)
            {
                value = t2.val;
            }
            else if(t1 != null && t2 == null)
            {
                value = t1.val;
            }
            value += digit;
            if(value>9)
            {
                digit = value / 10;
                value = value % 10;
            }
            else
                digit =0;
            
            temp.val = value;
            temp.next = new ListNode(0);
            temp = temp.next;
            if(t1 != null) t1 = t1.next;
            if(t2 != null)t2 = t2.next;
        }
        temp.val += digit;
        
        // cut off the reaer 0
        temp = res;
        if(temp == null) return null;
        else if(temp.next == null) return res;
        while(temp.next.next !=null)
        {
            temp = temp.next;
        }
        if(temp.next.val == 0)
            temp.next = null;
        
        return res;
    }
}