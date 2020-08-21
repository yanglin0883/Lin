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
        if(head == null) return null;
        for(RandomListNode i=head;i!=null;){
            RandomListNode temp = new RandomListNode(i.label);
            temp.next = i.next;
            temp.random = i.random;
            i.next= temp;
            i=temp.next;
        }
        for(RandomListNode i=head.next;i!=null;i=i.next.next){
            if(i.random != null)i.random = i.random.next;
            if(i.next == null) break;
        }
        RandomListNode res = head.next;
        for(RandomListNode i=head;i.next!=null;){
            RandomListNode temp = i.next;
            i.next = i.next.next;
            i=temp;
        }
        return res;
    }
}