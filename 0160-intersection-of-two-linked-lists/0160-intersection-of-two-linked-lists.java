/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 = 0;
        int len2 = 0;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while (temp1 != null) {
            len1++;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            len2++;
            temp2 = temp2.next;
        }
        if (len1 > len2) {
            temp1 = headA;
            while (temp1 != null) {
                temp2 = headB;
                while (temp2 != null) {
                    if (temp2 == temp1) {
                        return temp1;
                    }
                    temp2 = temp2.next;
                }
                temp1 = temp1.next;
            }
        } else {
            temp1 = headB;
            while (temp1 != null) {
                temp2 = headA;
                while (temp2 != null) {
                    if (temp2 == temp1) {
                        return temp1;
                    }
                    temp2 = temp2.next;
                }
            temp1 = temp1.next;

            }
        }
        return temp1;
    }
}