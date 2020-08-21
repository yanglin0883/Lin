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
     * @param head: The first node of linked list.
     * @return: Head node.
     */
    public ListNode removeDuplicates(ListNode head) {
        // write your code here
        if(head == null || head.next == null) return head;
        ListNode temp = head;
        while(temp.next!=null)
        {
            ListNode t =head;
            boolean flag=true;
            while(t!=null && t!=temp.next)
            {
                if(temp.next.val == t.val)
                {
                    flag= false;
                    break;
                }
                t=t.next;
            }
            if(flag)
                temp = temp.next;
            else
                temp.next= temp.next.next;
    //        System.out.println("temp= "+temp.val);
        }
        return head;
    }
}