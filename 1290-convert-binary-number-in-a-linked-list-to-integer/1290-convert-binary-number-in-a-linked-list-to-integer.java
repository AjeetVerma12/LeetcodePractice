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
    public int getDecimalValue(ListNode head) 
    {
        ListNode temp=head;
        int size=0;
        for(;temp!=null;)
        {
            size++;
            temp=temp.next;
        }
        size--;
        int decimal=0;
        temp=head;
        for(;size>=0;)
        {
            decimal+=(Math.pow(2,size--)*temp.val);
            temp=temp.next;
        }
        return decimal;
    }
}