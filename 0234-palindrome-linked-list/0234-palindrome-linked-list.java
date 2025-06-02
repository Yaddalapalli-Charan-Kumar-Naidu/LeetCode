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
        Stack stack=new Stack();
        ListNode temp=head;
        while(temp!=null){
            stack.add(temp.val);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(temp.val!=(int)stack.pop()){
                return false;
            }
            temp=temp.next;
        }
        if(stack.size()>0){
            return false;
        }
        return true;
    }
}