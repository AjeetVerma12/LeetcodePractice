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
    public ListNode reverseList(ListNode head) 
    {
        ListNode ans=new ListNode();
        ListNode temp=head;
        while(temp!=null)
        {
            ListNode curr=temp.next;
            temp.next=ans.next;
            ans.next=temp;
            temp=curr;
        }
        return ans.next;
    }
    
}