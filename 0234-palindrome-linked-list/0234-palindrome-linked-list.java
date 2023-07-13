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
    public ListNode calcMiddle(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
    public ListNode reverse(ListNode mid)
    {
        ListNode prev=null;
        ListNode curr=mid;
        while(curr!=null)
        {
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    
    public boolean isPalindrome(ListNode head) 
    {
        if(head==null)
        {
            return true;
        }
        ListNode samp=head;
        ListNode mid= calcMiddle(head);
        ListNode last= reverse(mid);
        while(last!=null)
        {
            if(last.val != samp.val)
            {
                return false;
            }
            samp=samp.next;
            last=last.next;
        }
        return true;
    }
}