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
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null)
        {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
        // ListNode ans=new ListNode();
        // ListNode prev=head;
        // ListNode curr=prev.next;
        // while(prev!=null)
        // {
        //     ListNode curr=prev.next;
        //     prev.next=ans.next;
        //     ans.next=prev;
        //     prev=curr;
        // }
        // return ans.next;
        // ListNode newHead=null;
        // while(head!=null)
        // {
        //     ListNode next=head.next;
        //     head.next=newHead;
        //     newHead=head;
        //     head=next;
        // }
        // return newHead;
    }
    
}