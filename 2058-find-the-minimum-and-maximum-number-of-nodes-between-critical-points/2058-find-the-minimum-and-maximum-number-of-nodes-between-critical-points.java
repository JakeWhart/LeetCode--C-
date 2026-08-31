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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> al = new ArrayList<>();
        ListNode temp = head;
        int prev = 0,pos = 0;
        while(temp != null){
           if(pos != 0 && temp.next != null){
            if((temp.val > prev && temp.val > temp.next.val) || (temp.val < prev && temp.val < temp.next.val)){
                al.add(pos);
            } 
           }
           prev = temp.val;
           pos++;
           temp = temp.next;
        }
        int[] res = {-1,-1};
        if(al.size() < 2) return res;
        int minDist = Integer.MAX_VALUE;

        for (int i = 1; i < al.size(); i++) {
            minDist = Math.min(minDist, al.get(i) - al.get(i - 1));
        }
        res[0] = minDist;
        res[1] = al.get(al.size()-1) - al.get(0);
        return res;
    }
}