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
    public ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        int middle = 0;
        if(size %2 == 0){
            middle = (size / 2);
        }
        else{
            middle = size / 2;
        }
        ListNode a = head;
        int s = 0;
        while(s != middle){
            a = a.next;
            s++;
        }
            head = a;
            return head;

    }
}