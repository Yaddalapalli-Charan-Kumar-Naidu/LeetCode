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
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=head;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode findKthNode(ListNode head,int k){
        ListNode temp=head;
        while(temp!=null && k>1){
            temp=temp.next;
            k--;
        }
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode nextNode=null;
        ListNode prevNode=null;
        while(temp!=null){
            ListNode KthNode=findKthNode(temp,k);
            if(KthNode==null){
                if(prevNode!=null){
                    prevNode.next=temp;
                }
                break;
            }
            nextNode=KthNode.next;
            KthNode.next=null;
            if(head==temp){
                head=reverse(temp);
            }
            else{
                prevNode.next=reverse(temp);
            }
            prevNode=temp;
            temp=nextNode;
        }
        return head;
    }
}