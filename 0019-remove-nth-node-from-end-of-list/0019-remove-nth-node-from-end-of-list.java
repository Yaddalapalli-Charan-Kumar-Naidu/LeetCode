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
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        temp=head;
        if(n==len){
            return head.next;
        }
        int count=0;
        while(temp!=null && count<len-n-1){
            temp=temp.next;
            count++;
        }
        if(temp.next!=null){
            temp.next=temp.next.next;
        }
        if(len==1){
            return null;
        }
        return head;
    }
}