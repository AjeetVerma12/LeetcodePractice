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
        // ListNode ans=new ListNode();
        // ListNode temp=head;
        // while(temp!=null)
        // {
        //     ListNode curr=temp.next;
        //     temp.next=ans.next;
        //     ans.next=temp;
        //     temp=curr;
        // }
        // return ans.next;
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
        ListNode newHead=null;
        while(head!=null)
        {
            ListNode next=head.next;
            head.next=newHead;
            newHead=head;
            head=next;
        }
        return newHead;
    }
    
}