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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        if(head.next==null)
        {
            return head.next;
        }
        ListNode temp=head;
        int size=0;
        while(temp!=null)
        {
            size++;
            temp=temp.next;
        }
        if(size-n==0)
        {
            return head.next;
        }
        temp=head;
        for(int i=1;i<size-n;i++)
        {
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}