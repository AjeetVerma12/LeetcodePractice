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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode temp = new ListNode(0);
        temp.next=head;
        Map<Integer, ListNode> map=new HashMap<>();
        int s=0;
        ListNode curr=temp;
        while(curr!=null)
        {
            s+=curr.val;
            map.put(s,curr);
            curr=curr.next;
        }
        s=0;
        curr=temp;
        while(curr!=null)
        {
            s+=curr.val;
            curr.next = map.get(s).next;
            curr=curr.next;
        }
        return temp.next;
    }
}