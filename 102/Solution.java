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
     * @return: True if it has a cycle, or false
     */
    public boolean hasCycle(ListNode head) {
        // write your code here
        if(head == null) return false;
        ArrayList<ListNode> nodes = new ArrayList<ListNode>();
        while(head!=null){
		if(head.next == head) return true;
            if(nodes.contains(head)) return true;
            else nodes.add(head);
            head=head.next;
        }
        return false;
    }
}s