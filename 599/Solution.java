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
    /*
     * @param node: a list node in the list
     * @param x: An integer
     * @return: the inserted new list node
     */
    public ListNode insert(ListNode node, int x) {
        // write your code here
        if(node == null)
        {
            ListNode temp = new ListNode(x);
            temp.next = temp;
            return temp;
        }
        
        while(node.next.val > node.val) node = node.next;
        node = node.next;
        
        ListNode i=node;
        boolean flag = true;
        for(i = node; i.next != node;i= i.next)
        {
            if(x >=i.val && x <= i.next.val)
            {
                flag = false;
                ListNode temp = new ListNode(x);
                temp.next = i.next;
                i.next = temp;
                break;
            }
        //    System.out.println(i.val+"");
        }
        if(flag)
        {
            ListNode temp = new ListNode(x);
            i.next = temp;
            temp.next = node;
        }
        return node;
    }
}