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
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // ListNode temp1=l1;
        // ListNode temp2=l2;
        // int carry=0;
        // ListNode dummy=new ListNode(0);
        // ListNode temp=dummy;
        // while(temp1!=null && temp2!=null){
        //     int sum=temp1.val+temp2.val+carry;
        //     carry=sum/10;
        //     System.out.println("carry:"+carry);
        //     int val=sum%10;
        //     ListNode newNode=new ListNode(val);
        //     temp.next=newNode;
        //     temp=newNode;
        //     temp1=temp1.next;
        //     temp2=temp2.next;
        // }
        // while(temp1!=null){
        //     int sum=temp1.val+carry;
        //     carry=sum/10;
        //     int val=sum%10;
        //     ListNode newNode=new ListNode(val);
        //     temp.next=newNode;
        //     temp=newNode;
        //     temp1=temp1.next;
        // }
        // while(temp2!=null){
        //     int sum=temp2.val+carry;
        //     carry=sum/10;
        //     int val=sum%10;
        //     ListNode newNode=new ListNode(val);
        //     temp.next=newNode;
        //     temp=newNode;
        //     temp1=temp2.next;
        // }
        // if(carry!=0){
        //     ListNode newNode=new ListNode(carry);
        //     temp.next=newNode;
        // }
        // return dummy.next;
        ListNode temp1=l1;
        ListNode temp2=l2;
        int carry=0;
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        while(temp1!=null || temp2!=null || carry!=0){
            int val1=(temp1!=null)?temp1.val:0;
            int val2=(temp2!=null)?temp2.val:0;
            int sum=val1+val2+carry;
            // System.out.println("sum:"+sum);
            carry=sum/10;
            int val=sum%10;
            ListNode newNode=new ListNode(val);
            temp.next=newNode;
            temp=newNode;
            if(temp1!=null) temp1=temp1.next;
            if(temp2!=null) temp2=temp2.next;
        }
        return dummy.next;
    }
}