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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        int len=1;
        if(temp==null){
            return null;
        }
        while(temp!=null && temp.next!=null){
            temp=temp.next;
            len++;
        }
        k=k%len;
        k=len-k;
        temp.next=head;
        temp=head;
        while(k>1){
            temp=temp.next;
            k--;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}