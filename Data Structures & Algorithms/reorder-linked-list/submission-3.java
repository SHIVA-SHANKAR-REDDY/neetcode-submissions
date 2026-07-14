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
    public ListNode reverseLL(ListNode head)
    {
        ListNode curr=head;
        ListNode prev=null;
        ListNode temp;
        while(curr!=null)
        {
            temp=curr.next;
            curr.next=prev;
            prev=curr;

            curr=temp;
        }
        return prev;
    }
    public ListNode findMid(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public void reorderList(ListNode head) {
        ListNode mid=findMid(head);
        ListNode rev=reverseLL(mid.next);
        mid.next=null;
        ListNode temp=head;
        ListNode t1;
        ListNode t2;
        while(temp!=null && rev!=null)
        {
            t1=rev.next;
            t2=temp.next;
            temp.next=rev;
            rev.next=t2;
            rev=t1;
            temp=t2;
        }
    }
    
}
