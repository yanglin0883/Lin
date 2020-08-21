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
     * @param head: the given linked list
     * @return: the array that store the values in reverse order 
     */
    public List<Integer> reverseStore(ListNode head) {
        // write your code here
        ArrayList<Integer> res =new ArrayList<Integer>();
        if(head==null)return res;
        int len =0;
        for(ListNode i=head;i!=null;i=i.next){
            res.add(0,i.val);
        }
        return res;
    }
}