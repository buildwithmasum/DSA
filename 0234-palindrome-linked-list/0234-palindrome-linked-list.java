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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        if(head.next==null){return true;}
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null;
        ListNode curr = slow.next;
        ListNode front;
        while(curr!=null){
            front=curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
            
        }
        slow.next=prev;
        fast=slow.next;
        ListNode temp=head;

        while(fast!=null){
            if(temp.val!=fast.val){
                return false;
            }

            temp=temp.next;
            fast=fast.next;
        }
        return true;
    }
}