/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) 
    {
        ListNode ans=new ListNode(-1,head);
        ListNode temp=ans;
        while(temp.next !=null)
        {
            if(temp.next.val!=val)
            {
                temp=temp.next;
            }
            else
            {
                temp.next=temp.next.next;
            }
        }
        return ans.next;
    }
}