/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    /**
     * @param head: The head of linked list with a random pointer.
     * @return: A new head of a deep copy of the list.
     */
    public RandomListNode copyRandomList(RandomListNode head) {
        // write your code here
        if(head==null) return head;
        RandomListNode p = head;
        while(p!=null){
            RandomListNode temp = new RandomListNode(p.label);
            temp.random = p.random;
            temp.next = p.next;
            p.next = temp;
            p = temp.next;
        }
        p=head.next;
        while(p!=null&&p.next!=null){
            if(p.random!=null)p.random = p.random.next;
            p = p.next.next;
        }
        RandomListNode res = head.next;
        p=head;
        while(p!=null&&p.next!=null){
            RandomListNode next = p.next;
            p.next = next.next;
            p = next;
        }
        return res;
    }
}