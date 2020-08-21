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
     * @param head: n
     * @return: The new head of reversed linked list.
     */
  public class Solution {
    /**
     * @param head: n
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        // write your code here
        if(head ==null)
            return null;
        ArrayList<ListNode> al = new ArrayList<ListNode>();
        while(head.next != null)// add to arraylist
        {
            al.add(head);
            head =head.next;
        }
        al.add(head);
        
        int rear = al.size()-1;
        head = al.get(0);// fix the index of 0
        head.next = null;
        al.set(0, head);
     //   System.out.println(al.get(0).val);
        head = al.get(rear);//tidy up the result
        ListNode temp =head;
        
        for(int i=rear-1;i>=0;i--)
        {
            temp.next = al.get(i);
            temp = temp.next;//System.out.println(i);
        }//System.out.println(head);
        return head;
    }
}