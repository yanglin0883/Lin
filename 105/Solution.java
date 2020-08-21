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
        RandomListNode res = new RandomListNode(head.label);
        RandomListNode temp = res;
        for(RandomListNode i=head.next;i!=null;i=i.next){
            temp.next = new RandomListNode(i.label);
            temp = temp.next;
        }
        temp=res;
        for(RandomListNode i=head;i!=null;i=i.next){
            if(i.random != null){
                
                int index=0;
                for(RandomListNode j=head;j!=null;j=j.next){
                    if(i.random == j) break;
                    index++;
                }
                // System.out.println(i.random.label+"    "+index);
                RandomListNode t=res;
                for(int j=0;j<index;j++){
                    t=t.next;
                }
                // System.out.println(t.label+" :: "+index);
                temp.random = t;
            }
            temp = temp.next;
        }
        
        return res;
    }
}