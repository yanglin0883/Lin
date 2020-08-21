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
     * @param n: An integer
     * @return: The head of linked list.
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // write your code here
        if(head == null) return null;
        ListNode fastPointer = new ListNode(0);
        fastPointer.next = head;
        ListNode slowPointer = fastPointer;
        ListNode res = slowPointer;
        for(int i=0;i<n;i++)
        {
            fastPointer = fastPointer.next;
        }
        // System.out.println("fastPointer = "+fastPointer.val+" slowPointer= "+slowPointer.val);
        while(fastPointer.next!=null)
        {
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
            // System.out.println("fastPointer = "+fastPointer.val+" slowPointer= "+slowPointer.val);
        }
        // System.out.println("fastPointer = "+fastPointer.val+" slowPointer= "+slowPointer.val);
        slowPointer.next = slowPointer.next.next;
        return res.next;
    }
}