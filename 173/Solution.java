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
     * @return: The head of linked list.
     */
    public ListNode insertionSortList(ListNode head) {
        // write your code here
        if(head == null ||head.next ==null) return head;
        ListNode res = new ListNode(-2147483648);
        while(head!=null){
            ListNode temp = res;
            while(temp!=null){
                if(head.val>=temp.val )
                if(temp.next==null|| head.val<=temp.next.val){
                    ListNode t =new ListNode(head.val);
                    t.next = temp.next;
                    temp.next = t;
                    break;
                }
                temp = temp.next;
            }
            head = head.next;
        }
        return res.next;
    }
}