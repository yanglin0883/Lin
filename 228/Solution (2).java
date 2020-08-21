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
     * @param head: the head of linked list.
     * @return: a middle node of the linked list
     */
    public ListNode middleNode(ListNode head) {
        // write your code here
        if(head == null || head.next == null) return head;
    //     int total=0;
    //     for(ListNode i= head; i!= null;i= i.next)
    //     {
    //         total++;
    //     }
    //     total=(total-1)/2;
    // //    System.out.println("total= "+ total);
    //     for(;total>0;total--)
    //     {
    //         head = head.next;
    //     }
    //     return head;
    
        ListNode fastPointer = new ListNode(0);
        fastPointer.next = head;
        ListNode slowPointer = fastPointer;
        boolean odd = false;
        while(fastPointer != null)
        {
            if(odd) slowPointer= slowPointer.next;
            odd = !odd;
            fastPointer = fastPointer.next;
        }
        return slowPointer;
    }
}