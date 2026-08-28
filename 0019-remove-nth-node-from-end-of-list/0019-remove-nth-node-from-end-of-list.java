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
    public ListNode removeNthFromEnd(ListNode head, int n) {
    
        ListNode temp=head;
        int count=1;
        while(temp.next!=null){
            count++;
            temp=temp.next;
         
        }

        if(count==n){
           ListNode newhead=head.next;
           head.next=null;
            return newhead;
        }
        int remove=count-n;

        temp=head;
       
        while(temp!=null){
            remove--;
            if(remove==0){
                break;
            }
            temp=temp.next;
        }
       
        ListNode temp2=temp.next;
        temp.next=temp.next.next;
        temp2.next=null;


        return head;

    }
}