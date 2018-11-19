package LeetCode.Easy;

import Utils.ListNode;

public class Easy21MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp = l1;
        while(temp != null && temp.next != null){
            temp = temp.next;
        }

        temp.next = l2;

        System.out.println(l1);
        ListNode prev1 = null;
        ListNode prev2 = temp;
        ListNode temp1 = l1;
        ListNode temp2 = temp.next;

        while(temp2 != null && temp1 != null){
            if(temp2.val < temp1.val){
                prev2.next = temp2.next;
                temp2.next = temp1;
                if(prev1 != null){
                    prev1.next = temp2;
                }
                prev1 = temp2;
                temp2 = temp2.next;
            }
            else {
                temp1 = temp1.next;
            }
        }
        return l2;
    }

    public static void main(String[] args){
        ListNode l1 = new ListNode(1);
        l1.insert(4);
        l1.insert(7);

        ListNode l2 = new ListNode(0);
        l1.insert(2);
        l1.insert(6);
        l1.insert(10);

        System.out.println(mergeTwoLists(l1, l2));
    }
}
