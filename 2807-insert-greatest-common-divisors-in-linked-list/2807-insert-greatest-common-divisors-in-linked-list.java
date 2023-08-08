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
    private int gcd(int num1,int num2)
    {
        while (num1>0 && num2>0) 
        {
            if (num1>num2) 
            {
                num1 = num1%num2;
            }
            else 
            {
                num2 = num2%num1;
            }
        }
        if (num1 == 0) 
        {
            return num2;
        }
        return num1;
    }
    
    public ListNode insertGreatestCommonDivisors(ListNode head) 
    {
        ListNode pre=head;
        ListNode curr=head.next;
        while(curr!=null)
        {
            int hcf=gcd(pre.val,curr.val);
            pre.next=new ListNode(hcf,curr);
            pre=curr;
            curr=curr.next;
        }
        return head;
    }
}