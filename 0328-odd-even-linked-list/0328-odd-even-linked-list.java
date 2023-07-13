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
    public ListNode oddEvenList(ListNode head) {
        if(head==null)
        {
            return head;
        }
        ListNode ans=head;
        ListNode temp=head.next;
        ListNode eve=temp;
        while(temp!=null && temp.next!=null)
        {
            ans.next=temp.next;
            ans=ans.next;
            temp.next=ans.next;
            temp=temp.next;
        }
        ans.next=eve;
        return head;
    }
}