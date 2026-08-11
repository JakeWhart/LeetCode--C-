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
        ListNode temp = head;
        int size = 0;
        if(head == null || head.next == null){
            return null;
        }
        
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        
        int dl = size - n;
       if(dl == 0){
        head = head.next;
        return head;
       }
        temp = head;
       for(int i = 0;i<dl-1 && temp != null;i++){
        temp = temp.next;
       }

       if(temp.next!=null){
            temp.next = temp.next.next;
       }
        return head;
        }
    }
